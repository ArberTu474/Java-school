// Implementoni klasën Student. Studenti ka emrin dhe numrin total të pikëve në quiz. Ndërtoni
// konstruktorin dhe metodat getName (), addQuiz(int score), getTotalScore () dhe
// getAverageScore(). Ju duhet të ruani dhe numrin e quiz-eve qe ka kryer studenti. Testoni klasën
// Student.

public class Usht2 {
  public static void main(String[] args) {
    Student student1 = new Student("Ben");

    student1.addQuiz(20);
    student1.addQuiz(10);
    student1.addQuiz(34);

    System.out.println("Name: " + student1.getName());
    System.out.println("Score: " + student1.getTotalScore());
    System.out.printf("Average Score: %.2f\n", student1.getAverageScore());

  }
}
