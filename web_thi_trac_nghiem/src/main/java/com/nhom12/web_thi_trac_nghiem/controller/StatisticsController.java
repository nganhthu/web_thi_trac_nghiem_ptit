package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class StatisticsController {

    // Trang thống kê
    @GetMapping("/statistics")
    public String showStatisticsPage() {
        return "statistics"; // Trả về view của trang thống kê
    }
}
