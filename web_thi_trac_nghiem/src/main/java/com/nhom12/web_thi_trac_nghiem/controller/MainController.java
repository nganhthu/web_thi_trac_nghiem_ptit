package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/main")
public class MainController {

    @GetMapping("/exams")
    public String getExams() {
        // Xử lý lấy danh sách các kỳ thi và trả về JSON
        return "Danh sách các kỳ thi";
    }

    @GetMapping("/search")
    public String searchExams(@RequestParam String keyword) {
        // Xử lý tìm kiếm và lọc kỳ thi và trả về JSON
        return "Kết quả tìm kiếm";
    }

    @PostMapping("/exam/{examId}/start")
    public String startExam(@PathVariable Long examId) {
        // Xử lý bắt đầu làm bài thi và trả về kết quả
        return "Bắt đầu làm bài thi";
    }
}
