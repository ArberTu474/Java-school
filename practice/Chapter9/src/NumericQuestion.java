// Add a class NumericQuestion to the question hierarchy of Section 9.1. If the response
// and the expected answer differ by no more than 0.01, then accept the response as
// correct.

public class NumericQuestion extends Question {
  private double answer;
  private final double TOLERANCE = 0.01;

  NumericQuestion(double answer) {
    this.answer = answer;
  }

  public boolean checkAnswer(double response) {
    if (Math.abs(response - answer) <= TOLERANCE) {
      return true;
    } else {
      return false;
    }
  }

}
