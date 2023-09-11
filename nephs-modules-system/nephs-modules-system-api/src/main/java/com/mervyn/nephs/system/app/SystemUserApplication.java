package com.mervyn.nephs.system.app;

import com.mervyn.nephs.common.Result;
import com.mervyn.nephs.system.entity.SystemUserDTO;


/**
 * @author 2hen9ao
 * @createDate 2023-09-07 11:36:55
 */
public interface SystemUserApplication {

    Result<String> createUser(SystemUserDTO userDTO);

    Result<SystemUserDTO> getUserById(String id);
}
