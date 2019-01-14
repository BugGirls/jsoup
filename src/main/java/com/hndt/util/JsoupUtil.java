package com.hndt.util;

import com.google.common.base.Strings;
import com.hndt.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @author Hystar
 * @date 2019/1/7
 */
@Slf4j
public class JsoupUtil {

    public static Article generatorArticleByUrl(Integer channel, String url) {
        Article article = new Article();

        try {
            // 根据 url 获取 Document
            Document document = Jsoup.connect(url).ignoreHttpErrors(true).get();

            // 标题
            String title = document.getElementsByClass("title").text();
            if (!Strings.isNullOrEmpty(title)) {
                article.setTitle(title);
            }

            // 时间和来源
            Elements infoElements = document.getElementsByClass("info");
            String text = infoElements.text();
            if (!Strings.isNullOrEmpty(text)) {
                String time = RegexUtil.regexTime(text, RegexUtil.TIME_EXCLUDE_MIN);
                String source = text.substring(text.indexOf("来源") + 3, text.indexOf("编辑") - 1);
                if (!Strings.isNullOrEmpty(time) && !Strings.isNullOrEmpty(source)) {
                    article.setPublishTime(DateUtil.getTimeAbortMinute(time));
                    article.setOrigin(source);
                }
            }

            // 正文
            String content = document.getElementsByClass("content").html();
            if (!Strings.isNullOrEmpty(content)) {
                article.setBody(content);
            }

            article.setChannelId(channel);
        } catch (Exception e) {
            log.info("{}", e.getMessage());
        }

        return article;
    }

    public static void main(String[] args) {
        generatorArticleByUrl(1, "http://www.zyzk666.com/main/putonggaozhao/gaozhaokuaixun/2018/1013/24284.html");
        generatorArticleByUrl(1, "http://www.zyzk666.com/main/putonggaozhao/gaozhaokuaixun/2018/1012/24278.html");
        generatorArticleByUrl(1, "http://www.zyzk666.com/main/putonggaozhao/gaozhaokuaixun/2018/1011/24273.html");
        generatorArticleByUrl(1, "http://www.zyzk666.com/main/putonggaozhao/gaozhaokuaixun/2018/1011/24274.html");
        generatorArticleByUrl(1, "http://www.zyzk666.com/main/putonggaozhao/gaozhaokuaixun/2018/0811/24008.html");
    }
}
