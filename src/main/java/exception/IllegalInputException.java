package exception;

public class IllegalInputException extends RuntimeException {
    private static final String ERROR_MESSAGE = "문자열이 잘못 입력되었습니다. 올바른 연산식을 입력해주세요.";

    public IllegalInputException() {
        super(ERROR_MESSAGE);

    }
}
