import java.util.List;

public class Calculator {

    // 계산기
    public Integer calculate(NumberAndOperator numberAndOperator) {
        List<Integer> numbers = numberAndOperator.getNumbers();
        List<Character> operators = numberAndOperator.getOperators();

        int prev = numbers.get(0);

        for (int i = 0; i < operators.size(); i++) {
            prev = searchOperation(prev, numbers.get(i + 1), operators.get(i));
        }

        return prev;
    }

    private Integer searchOperation(Integer prev, Integer next, Character operation) {
        switch (operation) {
            case '+':
                return prev + next;
            case '-':
                return prev - next;
            case '*':
                return prev * next;
            case '/':
                return prev / next;
        }

        throw new IllegalArgumentException("연산자가 잘못 입력되었습니다.");
    }
}
