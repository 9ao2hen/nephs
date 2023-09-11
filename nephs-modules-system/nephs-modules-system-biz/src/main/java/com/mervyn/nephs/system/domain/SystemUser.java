package com.mervyn.nephs.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName system_user
 */
@TableName(value ="system_user")
@Data
public class SystemUser implements Serializable {
    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    private Long pkId;

    /**
     * 业务id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

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
    private Integer gender;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 状态	0:未启用,1:已启用,2:禁用
     */
    private Integer status;

    /**
     * 已删除	0:未删除,1:已删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新人
     */
    private Date updateUser;

    /**
     * 租户
     */
    private Long tenant;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;



}