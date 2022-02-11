import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz12919 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String solution = solution(seoul);

        System.out.println(solution);
    }

    public static String solution(String[] seoul) {
        List<String> list = new ArrayList<>(Arrays.asList(seoul));

        return "김서방은 " + list.indexOf("Kim") + "에 있다";
    }
}
