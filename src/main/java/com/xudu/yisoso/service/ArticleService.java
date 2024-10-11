package com.xudu.yisoso.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xudu.yisoso.entity.Article;

import java.util.List;

/**
* @author xudu
* @description 针对表【article】的数据库操作Service
* @createDate 2024-09-06 18:49:07
*/
public interface ArticleService extends IService<Article> {

    List<Article> searchArticleList(String searchText);

}
