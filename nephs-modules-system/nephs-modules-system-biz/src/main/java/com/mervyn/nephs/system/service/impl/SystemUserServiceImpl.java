package com.mervyn.nephs.system.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.mervyn.nephs.base.utils.NephsSnowFlake;
import com.mervyn.nephs.system.domain.SystemUser;
import com.mervyn.nephs.system.mapper.SystemUserMapper;
import com.mervyn.nephs.system.service.SystemUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 2hen9ao
 * @description 针对表【system_user】的数据库操作Service实现
 * @createDate 2023-09-07 11:36:55
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {


    @Resource
    NephsSnowFlake nephsSnowFlake;
    @Resource
    SystemUserMapper userMapper;

    public String createUser(SystemUser systemUser) {
        systemUser.setId(nephsSnowFlake.generateId());
        systemUser.setPassword(SecureUtil.md5(systemUser.getPassword()));
        int insert = userMapper.insert(systemUser);
        return String.valueOf(systemUser.getId());
    }

    public SystemUser getUser(Long id) {
        return userMapper.getById(id);
    }

}




