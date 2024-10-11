package com.xudu.yisoso.datasource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xudu.yisoso.entity.User;
import com.xudu.yisoso.service.UserService;
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
public class UserDataSource implements DataSource<User>{

    @Resource
    private UserService userService;

    @Override
    public List<User> doSearch(String searchText, long pageNum, long pageSize) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().like(User::getUserName, searchText);

        return userService.list(queryWrapper);
    }
}
