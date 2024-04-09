package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Xử lý đăng nhập và trả về kết quả
        return "Đăng nhập thành công";
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest registerRequest) {
        // Xử lý đăng ký và trả về kết quả
        return "Đăng ký thành công";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Xin chào từ server!";
    }
}
