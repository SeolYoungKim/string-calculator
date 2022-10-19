import java.util.ArrayList;
import java.util.List;

public class NumberAndOperator {
    private final List<Integer> numbers = new ArrayList<>();
    private final List<Character> operators = new ArrayList<>();

    public NumberAndOperator(List<Integer> numbers, List<Character> operators) {
        this.numbers.addAll(numbers);
        this.operators.addAll(operators);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Character> getOperators() {
        return operators;
    }
}
