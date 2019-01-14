package com.hndt.service;

import com.hndt.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hystar
 * @date 2019/1/8
 */
public interface ArticleService extends JpaRepository<Article, Long> {
}
