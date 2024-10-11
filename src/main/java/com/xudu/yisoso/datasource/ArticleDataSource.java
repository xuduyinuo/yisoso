package com.xudu.yisoso.datasource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xudu.yisoso.entity.Article;
import com.xudu.yisoso.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PictureDataSource
 * @Description
 * @Author xudu
 * @Time 2024/9/10 15:12
 */
@Service
public class ArticleDataSource implements DataSource<Article>{

    @Resource
    private ArticleService articleService;

    @Override
    public List<Article> doSearch(String searchText, long pageNum, long pageSize) {
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().like(Article::getTitle, searchText);

        return articleService.list(queryWrapper);
    }
}
