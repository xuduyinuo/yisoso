package com.xudu.yisoso.dto.user;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 添加用户
 */
@Data
public class SearchUserRequest implements Serializable {

    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户账号
     */
    private String userAccount;


    /**
     * 用户昵称
     */
    private String userName;


    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户状态 0-正常 1-禁用 默认0
     */
    private Integer userStatus;

    /**
     * 用户角色 0-普通用户 1-管理员 默认0
     */
    private Integer userRole;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}