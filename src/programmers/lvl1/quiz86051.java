package programmers.lvl1;

import java.util.stream.IntStream;

public class quiz86051 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int solution = solution(numbers);
        System.out.println(solution);
    }

    public static int solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }

        return sum - IntStream.of(numbers).sum();
    }
}
