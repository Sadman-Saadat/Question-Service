package com.example.questionservice.repository;

import com.example.questionservice.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
    Question findQuestionById(String questionId);
}
