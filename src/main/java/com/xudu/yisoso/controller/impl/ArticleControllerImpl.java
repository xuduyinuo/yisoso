package com.xudu.yisoso.controller.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xudu.yisoso.common.ErrorCode;
import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.controller.ArticleController;
import com.xudu.yisoso.dto.article.AddArticleRequest;
import com.xudu.yisoso.dto.article.SearchArticleRequest;
import com.xudu.yisoso.entity.Article;
import com.xudu.yisoso.exception.ServiceException;
import com.xudu.yisoso.service.ArticleService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ArticleControllerImpl
 * @Description
 * @Author xudu
 * @Time 2024/9/6 18:58
 */
@RestController
public class ArticleControllerImpl implements ArticleController {

    @Resource
    private ArticleService articleService;

    @Override
    public Result add(AddArticleRequest addArticleRequest) {
        String title = addArticleRequest.getTitle();
        String content = addArticleRequest.getContent();
        String category = addArticleRequest.getCategory();
        Integer userId = addArticleRequest.getUserId();
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setCategory(category);
        article.setUserId(userId);
        boolean save = articleService.save(article);
        if (!save){
            throw new ServiceException(ErrorCode.SYSTEM_ERROR, "添加文章失败");
        }
        return Result.success(article.getId());
    }

    @Override
    public Result listArticle(SearchArticleRequest searchArticleRequest) {
        String title = searchArticleRequest.getTitle();
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().like(Article::getTitle, title);
        List<Article> list = articleService.list(queryWrapper);
        return Result.success(list);
    }
}
