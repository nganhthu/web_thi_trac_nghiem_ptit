package com.nhom12.web_thi_trac_nghiem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exam")
public class ExamController {

    @GetMapping("/{examId}")
    public String getExamQuestions(@PathVariable Long examId) {
        // Xử lý lấy danh sách câu hỏi cho bài thi và trả về JSON
        return "Danh sách câu hỏi cho bài thi";
    }

    @PostMapping("/{examId}/submit")
    public String submitExam(@PathVariable Long examId, @RequestBody List<Answer> answers) {
        // Xử lý nộp bài thi và tính điểm, sau đó trả về kết quả
        return "Bài thi đã được nộp";
    }
}
