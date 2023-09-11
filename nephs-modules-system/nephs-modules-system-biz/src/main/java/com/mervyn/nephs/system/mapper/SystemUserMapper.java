package com.mervyn.nephs.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mervyn.nephs.system.domain.SystemUser;
import org.apache.ibatis.annotations.Param;

/**
* @author 2hen9ao
* @description 针对表【system_user】的数据库操作Mapper
* @createDate 2023-09-07 11:36:55
* @Entity generator.domain.SystemUser
*/
public interface SystemUserMapper extends BaseMapper<SystemUser> {

    SystemUser getById(@Param("id") Long id);

}




