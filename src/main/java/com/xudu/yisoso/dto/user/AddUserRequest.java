package com.xudu.yisoso.dto.user;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 *
 * 添加用户
 */
@Data
public class AddUserRequest implements Serializable {


    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private MultipartFile userAvatar;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}