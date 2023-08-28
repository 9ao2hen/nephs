package com.mervyn.nephs.portal.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2hen9ao
 * @date 2023/8/27 22:00
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("")
    public String test(){
        return "hello";
    }
}
