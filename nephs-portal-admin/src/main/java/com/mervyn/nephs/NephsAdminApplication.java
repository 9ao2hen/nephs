package com.mervyn.nephs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2hen9ao
 * @date 2023/8/27 21:55
 */
@Slf4j
@RestController
@SpringBootApplication(scanBasePackages = {"com.mervyn.nephs.*.admin"})
public class NephsAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NephsAdminApplication.class, args);
    }

    @GetMapping("/echo")
    public String echo() {
        return "NephsAdminApplication";
    }
}
