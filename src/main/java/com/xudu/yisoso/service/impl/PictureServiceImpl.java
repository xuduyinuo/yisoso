package com.xudu.yisoso.service.impl;

import cn.hutool.json.JSONUtil;
import com.xudu.yisoso.common.ErrorCode;
import com.xudu.yisoso.entity.Picture;
import com.xudu.yisoso.exception.ServiceException;
import com.xudu.yisoso.service.PictureService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PictureServiceImpl
 * @Description 图片服务实现类
 * @Author xudu
 * @Time 2024/9/9 19:02
 */
@Service
public class PictureServiceImpl implements PictureService {


    @Override
    public List<Picture> searchPictureList(String searchText, long pageNum, long pageSize) {
        long current = (pageNum - 1) * pageSize;

        String url = String.format("https://cn.bing.com/images/search?q=%s&first=%s", searchText, current);
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new ServiceException(ErrorCode.SYSTEM_ERROR, "数据获取异常");
        }
        Elements elements = doc.select(".iuscp.isv");
        List<Picture> pictures = new ArrayList<>();
        for (Element element : elements) {
            // 取图片地址（murl）
            String m = element.select(".iusc").get(0).attr("m");
            Map<String, Object> map = JSONUtil.toBean(m, Map.class);
            String murl = (String) map.get("murl");
//            System.out.println(murl);
            // 取标题
            String title = element.select(".inflnk").get(0).attr("aria-label");
//            System.out.println(title);
            Picture picture = new Picture();
            picture.setTitle(title);
            picture.setUrl(murl);
            pictures.add(picture);
            if (pictures.size() >= pageSize) {
                break;
            }
        }


        return pictures;
    }
}
