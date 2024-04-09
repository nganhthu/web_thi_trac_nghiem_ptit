package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/result")
public class ResultController {

    @GetMapping("/{examId}")
    public String getExamResult(@PathVariable Long examId) {
        // Xử lý lấy kết quả của một bài thi cụ thể và trả về JSON
        return "Kết quả của bài thi";
    }

    @GetMapping("/{examId}/review")
    public String reviewExam(@PathVariable Long examId) {
        // Xử lý xem lại câu trả lời và đáp án đúng của bài thi và trả về JSON
        return "Xem lại câu trả lời và đáp án đúng";
    }
}
