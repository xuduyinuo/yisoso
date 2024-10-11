package com.xudu.yisoso.controller;

import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.dto.search.SearchRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName PictureController
 * @Description 搜索控制器接口
 * @Author xudu
 * @Time 2024/9/6 18:57
 */

@RequestMapping("search")
public interface SearchController {


    @GetMapping("all")
    Result searchAll(SearchRequest searchRequest);


}
