package Alagorithm.programmers.lvl1;

import java.util.ArrayList;
import java.util.List;

public class quiz12931 {
    public static void main(String[] args) {
        int solution = solution(123);
        System.out.println(solution);
    }

    public static int solution(int n) {
        char[] chars = String.valueOf(n).toCharArray();

        List<Integer> list = new ArrayList<>();

        for (char c : chars) {
            list.add(Character.getNumericValue(c));
        }

        return list.stream().mapToInt(i -> i).sum();
    }
}
