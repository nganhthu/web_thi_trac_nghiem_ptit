package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ExamEditController {

    // Trang tạo/chỉnh sửa kỳ thi
    @GetMapping("/exam/edit")
    public String showExamEditPage() {
        return "exam_edit"; // Trả về view của trang chỉnh sửa kỳ thi
    }
}
