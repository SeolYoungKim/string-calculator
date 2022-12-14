import exception.IllegalInputException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class StringParserTest {

    @DisplayName("문자열을 올바르게 파싱해서 객체에 넣어준다.")
    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2", "1 + 1 + 1 + 1"})
    void parse(String str) {
        NumberAndOperator parse = StringParser.getNumberAndOperator(str);

        assertThat(parse.getNumbers().size()).isEqualTo(4);
        assertThat(parse.getOperators().size()).isEqualTo(3);
    }

    @DisplayName("연산 식이 잘못 입력된 경우 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2 /", "1 + 1 + 1 + 1 -"})
    void parse2(String str) {
        assertThatThrownBy(() -> StringParser.getNumberAndOperator(str))
                .isInstanceOf(IllegalInputException.class);
    }
}