package com.xudu.yisoso.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xudu.yisoso.entity.User;
import com.xudu.yisoso.mapper.UserMapper;
import com.xudu.yisoso.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author xudu
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-09-06 18:48:19
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public List<User> searchUserList(String userName) {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().like(User::getUserName, userName);

        return this.list(queryWrapper);
    }
}




