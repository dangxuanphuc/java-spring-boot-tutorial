package com.phucdx.quizzapp.controller;

import com.phucdx.quizzapp.model.Question;
import com.phucdx.quizzapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> allQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("addQuestion")
    public String addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
}
