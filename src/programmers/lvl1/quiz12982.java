package programmers.lvl1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class quiz12982 {
    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        int solution = solution(d, budget);
        System.out.println(solution);
    }

    public static int solution(int[] d, int budget) {
        List<Integer> collect = Arrays.stream(d).boxed().sorted().collect(Collectors.toList());
        int result = 0;

        for (int i = 0; i < collect.size(); i++) {
            if (budget >= collect.get(i)) {
                budget = budget - collect.get(i);
                result++;
            }
        }
        return result;
    }
}
