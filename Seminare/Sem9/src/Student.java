// Implement a class Student. For the purpose of this exercise, a student has a name
// and a total quiz score. Supply an appropriate constructor and methods getName(),
// addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you
// also need to store the number of quizzes that the student took.

public class Student {
  private String name;
  private int totalScore;
  private int quizzesTaken;

  public Student(String name) {
    this.name = name;
    this.totalScore = 0;
    this.quizzesTaken = 0;
  }

  public String getName() {
    return name;
  }

  public int getTotalScore() {
    return totalScore;
  }

  public void addQuiz(int score) {
    totalScore += score;
    quizzesTaken++;
  }

  public double getAverageScore() {
    if (quizzesTaken == 0) {
      return 0.0;
    }
    return (double) totalScore / quizzesTaken;
  }

}
