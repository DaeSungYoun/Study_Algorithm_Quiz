package programmers.lvl1;

public class quiz70128 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int solution = solution(a, b);
        System.out.println(solution);
    }

    public static int solution(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + (a[i] * b[i]);
        }

        return sum;
    }
}
