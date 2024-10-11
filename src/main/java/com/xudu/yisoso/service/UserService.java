package com.xudu.yisoso.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xudu.yisoso.entity.User;

import java.util.List;

/**
* @author xudu
* @description 针对表【user】的数据库操作Service
* @createDate 2024-09-06 18:48:19
*/
public interface UserService extends IService<User> {

    List<User> searchUserList(String userName);

}
