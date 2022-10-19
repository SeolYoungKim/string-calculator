import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringParserTest {

    @DisplayName("문자열을 올바르게 파싱해서 객체에 넣어준다.")
    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2", "1 + 1 + 1 + 1"})
    void parse(String str) {
        NumberAndOperator parse = StringParser.getNumberAndOperator(str);
        Assertions.assertThat(parse.getNumbers().size()).isEqualTo(4);
        Assertions.assertThat(parse.getOperators().size()).isEqualTo(3);
    }
}