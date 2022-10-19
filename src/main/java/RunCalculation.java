import java.io.IOException;

public class RunCalculation {
    public static void main(String[] args) throws IOException {
        NumberAndOperator numberAndOperator = StringParser.getNumberAndOperator(Question.question());

        Calculator calculator = new Calculator();
        Integer result = calculator.calculate(numberAndOperator);

        Answer.answer(result);

    }
}
