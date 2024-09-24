package com.phucdx.quiz_service.service;

import com.phucdx.quiz_service.dao.QuizDao;
import com.phucdx.quiz_service.feign.QuizInterface;
import com.phucdx.quiz_service.model.QuestionWrapper;
import com.phucdx.quiz_service.model.Quiz;
import com.phucdx.quiz_service.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizDao quizDao;

    @Autowired
    private QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, numQ).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Quiz created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Quiz quiz = quizDao.findById(id).get();
        List<Integer> questionIds = quiz.getQuestionIds();
        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromIds(questionIds);

        return questions;
    }

    public ResponseEntity<String> submitQuiz(int id) {
        return null;
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses) {
        ResponseEntity<Integer> score = quizInterface.getScore(responses);
        return score;
    }
}
