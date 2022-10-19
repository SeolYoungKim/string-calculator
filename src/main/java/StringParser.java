import exception.IllegalInputException;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    // 입력받은 문자열을 파싱
    public static NumberAndOperator getNumberAndOperator(String str) {
        char[] chars = getCharArr(str);
        validateCharArr(chars.length);

        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            checkElement(chars, numbers, operators, i);
        }

        return new NumberAndOperator(numbers, operators);
    }

    private static void checkElement(char[] chars, List<Integer> numbers, List<Character> operators, int i) {
        if (i % 2 == 0) {
            numbers.add(chars[i] - '0');
            return;
        }

        operators.add(chars[i]);
    }

    private static char[] getCharArr(String str) {
        return str.replace(" ", "").toCharArray();
    }

    private static void validateCharArr(int size) {
        if (size % 2 == 0) {
            throw new IllegalInputException();
        }
    }

}
