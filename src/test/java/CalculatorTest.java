import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @DisplayName("계산이 올바르게 수행된다.")
    @Test
    void calculatorTest() {
        Calculator calculator = new Calculator();
        NumberAndOperator numberAndOperator = new NumberAndOperator();

        numberAndOperator.addNumbers(2);
        numberAndOperator.addNumbers(3);
        numberAndOperator.addNumbers(4);
        numberAndOperator.addNumbers(2);

        numberAndOperator.addOperators('+');
        numberAndOperator.addOperators('*');
        numberAndOperator.addOperators('/');

        Integer calculate = calculator.calculate(numberAndOperator);
        Assertions.assertThat(calculate).isEqualTo(10);
    }
}