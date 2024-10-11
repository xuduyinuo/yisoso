package com.xudu.yisoso.controller;

import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.dto.article.AddArticleRequest;
import com.xudu.yisoso.dto.article.SearchArticleRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ArticleController
 * @Description
 * @Author xudu
 * @Time 2024/9/6 18:57
 */

@RequestMapping("article")
public interface ArticleController {
    @PostMapping("add")
    Result add(AddArticleRequest addArticleRequest);
    @GetMapping("list")
    Result listArticle(SearchArticleRequest searchArticleRequest);


}
