import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class quiz12954 {
    public static void main(String[] args) {
        long[] solution = solution(-5, 10);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        long targetNumber = x;

        for (int i = 0; i < n; i++) {
            answer[i] = targetNumber;
            targetNumber = targetNumber + x;
        }

        return answer;
    }
}
