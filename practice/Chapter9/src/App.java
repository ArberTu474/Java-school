public class App {
    public static void main(String[] args) throws Exception {
        NumericQuestion question = new NumericQuestion(23.45);

        System.out.println(question.checkAnswer(23.453));
    }
}
