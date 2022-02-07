import java.util.Arrays;

/**
 *https://programmers.co.kr/learn/courses/30/lessons/12947
 */
public class quiz12947 {
    public static void main(String[] args) {
        boolean solution = solution(123123);
    }

    public static boolean solution(int x) {
        boolean answer = false;

        char[] splitString = Integer.toString(x).toCharArray();
        int sum = 0;

        for (char c : splitString) {
            sum = sum + Character.getNumericValue(c);
        }

        if ((x % sum) == 0 ) {
            answer = true;
        }

        return answer;
    }
}
