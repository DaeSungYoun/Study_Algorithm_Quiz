package programmers.lvl1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class quiz12933 {
    public static void main(String[] args) {
        long solution = solution(118372);
        System.out.println(solution);
    }

    public static long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        List<Integer> list = new ArrayList<>();

        for (char c : chars) {
            list.add(Character.getNumericValue(c));
        }

        List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        collect.forEach(e -> sb.append(e));

        return Long.parseLong(sb.toString());
    }
}
