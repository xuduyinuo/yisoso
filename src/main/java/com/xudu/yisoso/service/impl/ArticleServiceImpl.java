package com.xudu.yisoso.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xudu.yisoso.entity.Article;
import com.xudu.yisoso.mapper.ArticleMapper;
import com.xudu.yisoso.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author xudu
* @description 针对表【article】的数据库操作Service实现
* @createDate 2024-09-06 18:49:07
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

    @Override
    public List<Article> searchArticleList(String title) {
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().like(Article::getTitle, title);

        return list(queryWrapper);
    }
}




