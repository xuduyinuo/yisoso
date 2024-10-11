package com.xudu.yisoso.controller.impl;

import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.controller.PictureController;
import com.xudu.yisoso.entity.Picture;
import com.xudu.yisoso.service.PictureService;
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
public class PictureControllerImpl implements PictureController {

    @Resource
    private PictureService pictureService;

    @Override
    public Result listPicture(String searchText, Long pageNum, Long pageSize) {
        List<Picture> pictures = pictureService.searchPictureList(searchText, pageNum, pageSize);
        return Result.success(pictures);
    }
}
