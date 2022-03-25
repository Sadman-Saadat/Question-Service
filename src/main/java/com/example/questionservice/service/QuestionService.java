package com.example.questionservice.service;

import com.example.questionservice.entity.Question;
import com.example.questionservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }
    public Question findQuestionById(String questionId) {
        return questionRepository.findQuestionById(questionId);
    }
}
