package com.example.questionservice.controller;

import com.example.questionservice.entity.Question;
import com.example.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @PostMapping("/")
    public Question saveEmployee(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }
    @GetMapping("/{id}")
    public Question findEmployeeById(@PathVariable("id") String questionId){
        return questionService.findQuestionById(questionId);
    }
}
