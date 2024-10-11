package com.xudu.yisoso.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName Picture
 */

@Data
public class Picture implements Serializable {

    /**
     * 图片标题
     */
    private String title;

    /**
     * 图片链接
     */
    private String url;


    private static final long serialVersionUID = 1L;
}