package com.hndt;

import com.hndt.dao.ArticleMapper;
import com.hndt.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class JsoupApplicationTests {

    @Resource
    private ArticleMapper articleMapper;

    /**
     * 根据 XML 文档字符串获取 Document
     */
    @Test
    public void contextLoads() {
        String str = "<html><a href='#'>WWW.BAIDU.COM</a></html>";
        //根据 XML 文档字符串获取 Document
        Document document = Jsoup.parse(str);
        log.info(document.toString());
    }

    /**
     * 根据文件获取 Document
     * 加载 src/book.xml
     */
    @Test
    public void test2() throws Exception {
        //获取文件路径
        String path = this.getClass().getResource("/book.xml").getPath();

        File file = new File(path);

        //根据文件获取 Document
        Document document = Jsoup.parse(file, "UTF-8");
        System.out.println(document);
    }

    /**
     * 根据 url 获取 Document
     */
    @Test
    public void test3() throws Exception {
        String url = "http://www.zyzk666.com/main/putonggaozhao/gaozhaokuaibao/2018/1113/24395.html";
        //根据 url 获取 Document
        Document document = Jsoup.connect(url).get();
        System.out.println(document.getElementById("act-pnt"));
    }

    @Test
    public void test4() {
        Article article = new Article();
        article.setTitle("1");
        article.setBody("2");
        article.setPublishTime(new Date());
        articleMapper.insertSelective(article);
    }

}

