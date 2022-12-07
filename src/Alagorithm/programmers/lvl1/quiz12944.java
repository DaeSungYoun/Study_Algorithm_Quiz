package Alagorithm.programmers.lvl1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class quiz12944 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        double solution = solution(arr);
        System.out.println(solution);
    }

    public static double solution(int[] arr) {
        double sum = 0;

        for (int number : arr) {
            sum = sum + number;
        }

        return sum / arr.length;
    }
}
