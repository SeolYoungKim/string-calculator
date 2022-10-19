import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question {

    public static String question() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열을 입력해 주세요. : ");

        return br.readLine();
    }
}
