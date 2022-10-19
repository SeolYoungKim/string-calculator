import exception.IllegalOperatorException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @DisplayName("계산이 올바르게 수행된다.")
    @Test
    void calculatorTest() {
        Calculator calculator = new Calculator();

        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        operators.add('+');
        operators.add('*');
        operators.add('/');

        NumberAndOperator numberAndOperator = new NumberAndOperator(numbers, operators);
        Integer calculate = calculator.calculate(numberAndOperator);

        assertThat(calculate).isEqualTo(10);
    }

    @DisplayName("연산자를 잘못 입력하면 예외가 발생한다.")
    @Test
    void calculatorTest2() {
        Calculator calculator = new Calculator();

        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        operators.add('?');
        operators.add('*');
        operators.add('/');

        NumberAndOperator numberAndOperator = new NumberAndOperator(numbers, operators);

        assertThatThrownBy(() -> calculator.calculate(numberAndOperator))
                .isInstanceOf(IllegalOperatorException.class);
    }
}