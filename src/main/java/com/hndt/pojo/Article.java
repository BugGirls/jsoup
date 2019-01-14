package com.hndt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author Hystar
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 栏目ID
     */
    private Integer channelId;

    /**
     * 正文标题
     */
    private String title;

    /**
     * 内容
     */
    private String body;

    /**
     * 来源
     */
    private String origin;

    /**
     * 文档附件
     */
    private String attachments;

    /**
     * 正文图片
     */
    private String bodyImages;

    /**
     * 发布日期
     */
    private Date publishTime;

}