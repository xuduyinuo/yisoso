package com.xudu.yisoso.vo;

import com.xudu.yisoso.entity.Article;
import com.xudu.yisoso.entity.Picture;
import com.xudu.yisoso.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SearchVO
 * @Description
 * @Author xudu
 * @Time 2024/9/10 9:18
 */
@Data
public class SearchVO implements Serializable {


    private static final long serialVersionUID = -4184575026883993899L;


    private List<Article> articleList;

    private List<Picture> pictureList;

    private List<User> userList;

    //有其他数据源的话直接按上述方法添加即可


}
