package com.hndt.service;

import com.google.common.base.Strings;
import com.hndt.enums.*;
import com.hndt.pojo.Article;
import com.hndt.util.DateUtil;
import com.hndt.util.JsoupUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Hystar
 * @date 2019/1/7
 */
@Service
@Slf4j
public class JsoupService {

    @Resource
    private ArticleService articleService;

    private static Integer count = 0;

    /**
     * 获取网页数据
     */
    public synchronized void test() throws InterruptedException {
        for (ZiXunTouSu values : ZiXunTouSu.values()) {
            for (int year = 2013; year < 2019; year++) {
                for (int month = 0; month < 12; month++) {
                    count = 0;
                    int days = DateUtil.getDaysOfMonth(year, month);
                    for (int day = 0; day < days; day++) {
                        for (int id = 1; id < 25000; id++) {
                            StringBuffer url = new StringBuffer("http://www.zyzk666.com/main" + values.getValue()).append(year);
                            if ((month + 1) < 10 && (day + 1) < 10) {
                                url.append("/").append("0" + (month + 1)).append("0" + (day + 1));
                            } else if ((month + 1) < 10 && (day + 1) >= 10) {
                                url.append("/").append("0" + (month + 1)).append((day + 1));
                            } else if ((month + 1) >= 10 && (day + 1) >= 10) {
                                url.append("/").append((month + 1)).append((day + 1));
                            }
                            url.append("/").append(id).append(".html");

                            Article article = JsoupUtil.generatorArticleByUrl(values.getCode(), url.toString());
                            if (!Strings.isNullOrEmpty(article.getTitle())) {
                                log.info("URL：{}，文章名称：{}", url.toString(), article.getTitle());
                                count++;
                                articleService.save(article);
                            }
                        }
                    }
                    log.info("当前栏目：" + values.getValue() + "，当前时间：" + year + "年 " + (month + 1) + "月，文章数量：" + count);
                    log.info("-----------------------------------------------------------------");
                }
            }
        }
    }

}
