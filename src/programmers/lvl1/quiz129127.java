package programmers.lvl1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class quiz129127 {
    public static void main(String[] args) {
        String asDFasdf = solution("aAbBcCdDeE");
        System.out.println(asDFasdf);
    }

    public static String solution(String s) {
        char[] chars = s.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (char c : chars) {
            list.add((int) c);
        }

        StringBuilder sb = new StringBuilder();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> {
                    sb.append((char)((int)n));
                });

        return sb.toString();
    }
}
