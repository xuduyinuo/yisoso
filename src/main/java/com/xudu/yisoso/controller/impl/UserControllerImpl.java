package com.xudu.yisoso.controller.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xudu.yisoso.common.ErrorCode;
import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.controller.UserController;
import com.xudu.yisoso.dto.user.AddUserRequest;
import com.xudu.yisoso.dto.user.LoginUserRequest;
import com.xudu.yisoso.dto.user.SearchUserRequest;
import com.xudu.yisoso.entity.User;
import com.xudu.yisoso.exception.ServiceException;
import com.xudu.yisoso.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName UserControllerImpl
 * @Description
 * @Author xudu
 * @Time 2024/9/6 18:58
 */
@RestController
public class UserControllerImpl implements UserController {

    @Resource
    private UserService userService;

    @Override
    public String test() {
        return "test";
    }

    @Override
    public Result userLogin(LoginUserRequest loginUserRequest, HttpServletRequest request) {
        String userAccount = loginUserRequest.getUserAccount();
        String userPassword = loginUserRequest.getUserPassword();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUserAccount, userAccount);
        User user = userService.getOne(queryWrapper);
        if (user == null) {
            throw new ServiceException(ErrorCode.PARAMS_ERROR, "用户不存在");
        }
        if (!user.getUserPassword().equals(userPassword)){
            throw new ServiceException(ErrorCode.PARAMS_ERROR, "密码错误");
        }
        return Result.success(user);

    }

    @Override
    public Result add(AddUserRequest addUserRequest) {
        String userAccount = addUserRequest.getUserAccount();
        String userPassword = addUserRequest.getUserPassword();
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserPassword(userPassword);
        userService.save(user);
        return Result.success(user.getId());

    }

    @Override
    public Result list(SearchUserRequest searchUserRequest) {
        String userName = searchUserRequest.getUserName();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().like(User::getUserName, userName);
        List<User> list = userService.list(queryWrapper);
        return Result.success(list);
    }
}
