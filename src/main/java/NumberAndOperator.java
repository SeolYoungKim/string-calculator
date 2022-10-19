import java.util.ArrayList;
import java.util.List;

public class NumberAndOperator {
    private final List<Integer> numbers = new ArrayList<>();
    private final List<Character> operators = new ArrayList<>();

    public void addNumbers(Integer number) {
        this.numbers.add(number);
    }

    public void addOperators(Character operator) {
        this.operators.add(operator);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Character> getOperators() {
        return operators;
    }
}
