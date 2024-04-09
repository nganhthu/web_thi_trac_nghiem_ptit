package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class StudentResultsController {

    // Trang xem kết quả của từng sinh viên
    @GetMapping("/student/results")
    public String showStudentResultsPage() {
        return "student_results"; // Trả về view của trang xem kết quả của sinh viên
    }
}

