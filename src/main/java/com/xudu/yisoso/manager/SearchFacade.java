package com.xudu.yisoso.manager;

import com.xudu.yisoso.datasource.ArticleDataSource;
import com.xudu.yisoso.datasource.PictureDataSource;
import com.xudu.yisoso.datasource.UserDataSource;
import com.xudu.yisoso.dto.search.SearchRequest;
import com.xudu.yisoso.entity.Article;
import com.xudu.yisoso.entity.Picture;
import com.xudu.yisoso.entity.User;
import com.xudu.yisoso.vo.SearchVO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName SearchFacade
 * @Description 聚合搜索-应用门面模式
 * @Author xudu
 * @Time 2024/9/10 14:52
 */
@Component
public class SearchFacade {
    // @Resource
    // private PictureService pictureService;
    //
    // @Resource
    // private ArticleService articleService;
    //
    // @Resource
    // private UserService userService;

    @Resource
    private ArticleDataSource articleDataSource;

    @Resource
    private PictureDataSource pictureDataSource;

    @Resource
    private UserDataSource userDataSource;


    public SearchVO searchAll(SearchRequest searchRequest) {

        String searchText = searchRequest.getSearchText();
        String type = searchRequest.getType();
        SearchVO searchVO = new SearchVO();

        if (type == null){
            List<User> users = userDataSource.doSearch(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
            searchVO.setUserList(users);

            List<Picture> pictures = pictureDataSource.doSearch(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
            searchVO.setPictureList(pictures);

            List<Article> articles = articleDataSource.doSearch(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
            searchVO.setArticleList(articles);
        }else{
            switch (type){
                case "user":
                    List<User> users = userDataSource.doSearch(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
                    searchVO.setUserList(users);
                    break;
                case "picture":
                    List<Picture> pictures = pictureDataSource.doSearch(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
                    searchVO.setPictureList(pictures);
                    break;
                case "article":
                    List<Article> articles = articleDataSource.doSearch(searchText, searchRequest.getCurrent(), searchRequest.getPageSize());
                    searchVO.setArticleList(articles);
                    break;
                default:
                    break;
            }
        }


    return searchVO;


    }
}
