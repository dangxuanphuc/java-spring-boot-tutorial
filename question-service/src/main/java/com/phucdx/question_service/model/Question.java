package com.phucdx.question_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    private int id;
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private String difficultyLevel;
    private String category;
}
