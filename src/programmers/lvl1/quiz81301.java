package programmers.lvl1;

import java.util.HashMap;
import java.util.Map;

public class quiz81301 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        int solution = solution(s);
        System.out.println(solution);
    }

    public static int solution(String s) {
        Map<Integer, String> numString = new HashMap<>();
        numString.put(0, "zero");
        numString.put(1, "one");
        numString.put(2, "two");
        numString.put(3, "three");
        numString.put(4, "four");
        numString.put(5, "five");
        numString.put(6, "six");
        numString.put(7, "seven");
        numString.put(8, "eight");
        numString.put(9, "nine");

        for (int i = 0; i < 10; i++) {
            String s1 = s.replaceAll(String.valueOf(numString.get(i)), String.valueOf(i));
            s = s1;
        }

        return Integer.parseInt(s);
    }
}
