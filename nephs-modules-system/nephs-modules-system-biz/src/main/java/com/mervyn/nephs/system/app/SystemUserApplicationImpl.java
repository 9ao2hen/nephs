package com.mervyn.nephs.system.app;

import com.mervyn.nephs.common.Result;
import com.mervyn.nephs.common.Results;
import com.mervyn.nephs.common.exception.ServiceException;
import com.mervyn.nephs.system.converter.SystemUserConverter;
import com.mervyn.nephs.system.domain.SystemUser;
import com.mervyn.nephs.system.entity.SystemUserDTO;
import com.mervyn.nephs.system.service.SystemUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 2hen9ao
 * @date 2023/9/7 17:45
 */
@Service
public class SystemUserApplicationImpl implements SystemUserApplication {

    @Resource
    SystemUserService userService;

    @Override
    public Result<String> createUser(SystemUserDTO userDTO) {
        SystemUser systemUser = SystemUserConverter.instance.toSystemUser(userDTO);
        String userId = userService.createUser(systemUser);
        return Results.success(userId);
    }

    @Override
    public Result<SystemUserDTO> getUserById(String id) {
        if (true){
            throw new ServiceException(100,"出错了");
        }

        SystemUser user = userService.getUser(Long.valueOf(id));
        SystemUserDTO systemUserDTO = SystemUserConverter.instance.toSystemUserDTO(user);

        return Results.success(systemUserDTO);
    }
}
