package Alagorithm.programmers.lvl1;

import java.util.Arrays;

public class quiz17681 {
    public static void main(String[] args) {
        int n = 1;
        int[] arr1 = {9};
        int[] arr2 = {30};

        String[] solution = solution(n, arr1, arr2);
        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('0', ' ');
            answer[i] = answer[i].replace('1', '#');

            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        return answer;
    }
}
