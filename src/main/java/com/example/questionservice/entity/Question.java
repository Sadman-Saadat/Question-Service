package com.example.questionservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Question {
    @Id
    private String id;
    @Field
    private String description;
    @Field
    private String tag;
    @Field
    private double point;
    @Field
    private String[] options;




}
