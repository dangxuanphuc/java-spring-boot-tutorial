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
//        Optional<Quiz> quiz = quizDao.findById(id);
//        List<Question> questions = quiz.get().getQuestions();
        List<QuestionWrapper> questionWrappers = new ArrayList<>();
//
//        for (Question q : questions) {
//            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
//            questionWrappers.add(qw);
//        }

        return new ResponseEntity<>(questionWrappers, HttpStatus.OK);
    }

    public ResponseEntity<String> submitQuiz(int id) {
        return null;
    }

    public ResponseEntity<String> calculateResult(int id, List<Response> responses) {
//        Quiz quiz = quizDao.findById(id).get();
//        List<Question> questions = quiz.getQuestions();
//        int correct = 0;
//        int i = 0;
//
//        for (Response r : responses) {
//            if (r.getResponse().equals(questions.get(i).getAnswer())) {
//                correct++;
//            }
//            i++;
//        }

        return new ResponseEntity<>("Correct: ", HttpStatus.OK);
    }
}
