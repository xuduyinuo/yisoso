package com.xudu.yisoso.controller.impl;

import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.controller.SearchController;
import com.xudu.yisoso.dto.search.SearchRequest;
import com.xudu.yisoso.manager.SearchFacade;
import com.xudu.yisoso.service.ArticleService;
import com.xudu.yisoso.service.PictureService;
import com.xudu.yisoso.service.UserService;
import com.xudu.yisoso.vo.SearchVO;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SearchControllerImpl
 * @Description 搜索控制器实体类
 * @Author xudu
 * @Time 2024/9/6 18:58
 */
@RestController
public class SearchControllerImpl implements SearchController {

    @Resource
    private PictureService pictureService;


    @Resource
    private ArticleService articleService;

    @Resource
    private UserService userService;

    @Resource
    private SearchFacade searchFacade;


    @Override
    public Result searchAll(SearchRequest searchRequest) {

        SearchVO resultSearchVO = searchFacade.searchAll(searchRequest);
        return Result.success(resultSearchVO);
        // String searchText = searchRequest.getSearchText();
        //
        // SearchVO searchVO = new SearchVO();
        //
        // List<User> users = userService.searchUserList(searchText);
        // searchVO.setUserList(users);
        //
        // List<Picture> pictures = pictureService.searchPictureList(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
        //
        // searchVO.setPictureList(pictures);
        //
        // List<Article> articles = articleService.searchArticleList(searchText);
        //
        // searchVO.setArticleList(articles);
        //
        // return Result.success(searchVO);


    }
}
