package com.phucdx.quizzapp.service;

import com.phucdx.quizzapp.dao.QuestionDao;
import com.phucdx.quizzapp.dao.QuizDao;
import com.phucdx.quizzapp.model.Question;
import com.phucdx.quizzapp.model.QuestionWrapper;
import com.phucdx.quizzapp.model.Quiz;
import com.phucdx.quizzapp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizDao quizDao;

    @Autowired
    private QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Quiz created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questions = quiz.get().getQuestions();
        List<QuestionWrapper> questionWrappers = new ArrayList<>();

        for (Question q : questions) {
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionWrappers.add(qw);
        }

        return new ResponseEntity<>(questionWrappers, HttpStatus.OK);
    }

    public ResponseEntity<String> submitQuiz(int id) {
        return null;
    }

    public ResponseEntity<String> calculateResult(int id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int correct = 0;
        int i = 0;

        for (Response r : responses) {
            if (r.getResponse().equals(questions.get(i).getAnswer())) {
                correct++;
            }
            i++;
        }

        return new ResponseEntity<>("Correct: " + correct + "/" + questions.size(), HttpStatus.OK);
    }
}
