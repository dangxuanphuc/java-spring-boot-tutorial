package QuizConsoleApp;

import java.util.Scanner;

public class QuestionService {
  Question[] questions = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {
    questions[0] = new Question(1, "2 + 2 = ", "1", "2", "3", "4", "4");
    questions[1] = new Question(2, "5 - 3 = ", "2", "5", "3", "4", "2");
    questions[2] = new Question(3, "2 + 7 = ", "3", "5", "7", "9", "9");
    questions[3] = new Question(4, "4 * 2 = ", "2", "8", "4", "7", "8");
    questions[4] = new Question(5, "8 / 4 = ", "5", "2", "1", "4", "2");
  }

  public void playQuiz() {
    Scanner sc = new Scanner(System.in);
    int i = 0;

    for (Question q : questions) {
      System.out.println("Question " + q.getId() + ":");
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());

      selection[i] = sc.nextLine();
      i++;
    }

    for (String s : selection) {
      System.out.println(s);
    }

    sc.close();
  }

  public void printScore() {
    int score = 0;

    for (int i = 0; i < questions.length; i++) {
      Question que = questions[i];
      String actualAnswer = que.getAnswer();
      String userAnswer = selection[i];

      if (actualAnswer.equals(userAnswer)) {
        score += 20;
      }
    }

    System.out.println("Score: " + score);
  }
}
