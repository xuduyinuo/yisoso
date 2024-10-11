package com.xudu.yisoso.controller;

import com.xudu.yisoso.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName PictureController
 * @Description 图片控制器
 * @Author xudu
 * @Time 2024/9/6 18:57
 */

@RequestMapping("picture")
public interface PictureController {
    @GetMapping("list")
    Result listPicture(String searchText, Long pageNum, Long pageSize);


}
