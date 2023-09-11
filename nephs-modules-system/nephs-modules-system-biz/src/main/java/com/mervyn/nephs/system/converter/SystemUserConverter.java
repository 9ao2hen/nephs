package com.mervyn.nephs.system.converter;

import com.mervyn.nephs.system.domain.SystemUser;
import com.mervyn.nephs.system.entity.SystemUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author 2hen9ao
 * @date 2023/9/7 17:47
 */
@Mapper
public interface SystemUserConverter {

    SystemUserConverter instance = Mappers.getMapper(SystemUserConverter.class);

    SystemUser toSystemUser(SystemUserDTO dto);

    List<SystemUser> toSystemUser(List<SystemUserDTO> dto);

    SystemUserDTO toSystemUserDTO(SystemUser user);

    List<SystemUserDTO> toSystemUserDTO(List<SystemUser> user);
}
