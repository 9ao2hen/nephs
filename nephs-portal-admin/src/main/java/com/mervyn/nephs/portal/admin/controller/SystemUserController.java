package com.mervyn.nephs.portal.admin.controller;

import com.mervyn.nephs.common.Result;
import com.mervyn.nephs.system.app.SystemUserApplication;
import com.mervyn.nephs.system.entity.SystemUserDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 2hen9ao
 * @date 2023/9/7 11:49
 */
@RestController
@RequestMapping("/system/user")
public class SystemUserController {

    @Resource
    SystemUserApplication userApp;


    @GetMapping("/get")
    public Result<SystemUserDTO> getUserList(@RequestParam String id){
        return userApp.getUserById(id);
    }

    @PostMapping("/save")
    public Result<String> getUserList(@RequestBody SystemUserDTO user){
        return userApp.createUser(user);
    }


}
