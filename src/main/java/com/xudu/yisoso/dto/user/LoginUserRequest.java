package com.xudu.yisoso.dto.user;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 添加用户
 */
@Data
public class LoginUserRequest implements Serializable {


    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}