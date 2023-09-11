package com.mervyn.nephs.system.service;

import com.mervyn.nephs.system.domain.SystemUser;

/**
 * @author 2hen9ao
 * @description 针对表【system_user】的数据库操作Service
 * @createDate 2023-09-07 11:36:55
 */
public interface SystemUserService {

    String createUser(SystemUser systemUser);

    SystemUser getUser(Long id);
}
