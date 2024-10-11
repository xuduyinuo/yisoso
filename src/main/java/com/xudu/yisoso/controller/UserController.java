package com.xudu.yisoso.controller;

import com.xudu.yisoso.common.Result;
import com.xudu.yisoso.dto.user.AddUserRequest;
import com.xudu.yisoso.dto.user.LoginUserRequest;
import com.xudu.yisoso.dto.user.SearchUserRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName UserController
 * @Description
 * @Author xudu
 * @Time 2024/9/6 18:57
 */

@RequestMapping("user")
public interface UserController {

    @GetMapping("test")
    String test();


    @GetMapping("login")
    Result userLogin(@RequestBody LoginUserRequest loginUserRequest, HttpServletRequest request);

    /**
     * 添加用户
     */
    @PostMapping("add")
    Result add(AddUserRequest addUserRequest);

    @GetMapping("list")
    Result list(SearchUserRequest searchUserRequest);
}
