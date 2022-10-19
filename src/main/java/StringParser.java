public class StringParser {

    // 입력받은 문자열을 파싱
    public static NumberAndOperator getNumberAndOperator(String str) {
        char[] chars = getCharArr(str);
        NumberAndOperator numberAndOperator = new NumberAndOperator();

        for (int i = 0; i < chars.length; i++) {
            checkElement(chars, numberAndOperator, i);
        }

        return numberAndOperator;
    }

    private static void checkElement(char[] chars, NumberAndOperator numberAndOperator, int i) {
        if (i % 2 == 0) {
            numberAndOperator.addNumbers(chars[i] - '0');
            return;
        }

        numberAndOperator.addOperators(chars[i]);
    }

    private static char[] getCharArr(String str) {
        return str.replace(" ", "").toCharArray();
    }

}
