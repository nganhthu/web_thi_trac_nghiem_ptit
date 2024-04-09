package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    // Trang đăng nhập Admin
    @GetMapping("/login")
    public String showAdminLoginForm() {
        return "admin_login"; // Trả về view của trang đăng nhập Admin
    }

    // Dashboard Admin
    @GetMapping("/dashboard")
    public String showAdminDashboard() {
        return "admin_dashboard"; // Trả về view của dashboard Admin
    }
}
