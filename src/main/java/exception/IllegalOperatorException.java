package exception;

public class IllegalOperatorException extends RuntimeException {
    private static final String ERROR_MESSAGE = "연산자가 잘못 입력되었습니다.";

    public IllegalOperatorException() {
        super(ERROR_MESSAGE);
    }
}
