package com.mervyn.nephs.system.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author 2hen9ao
 * @date 2023/9/8 20:37
 */
@Data
public class SystemUserVO {


    /**
     * 业务id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;


    /**
     * 备注
     */
    private String remark;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 性别	0:未知,1:男,2:女
     */
    private String gender;

    /**
     * 头像
     */
    private String avatar;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    /**
     * 租户
     */
    private String tenant;

    private static final long serialVersionUID = -3088915864715407901L;
}
