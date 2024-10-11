package com.xudu.yisoso.service;

import com.xudu.yisoso.entity.Picture;

import java.util.List;

/**
* @author xudu
* @description 图片服务接口
* @createDate 2024-09-06 18:48:19
*/
public interface PictureService {

    List<Picture> searchPictureList(String searchText, long pageNum, long pageSize);

}
