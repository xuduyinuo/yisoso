package com.xudu.yisoso.dto.article;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName article
 */
@TableName(value ="article")
@Data
public class SearchArticleRequest implements Serializable {
    /**
     * 文章id
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章类别
     */
    private String category;

    /**
     * 创建文章的用户id
     */
    private Integer userId;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}