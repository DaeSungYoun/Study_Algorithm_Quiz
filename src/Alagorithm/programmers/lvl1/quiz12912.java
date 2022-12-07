package Alagorithm.programmers.lvl1;

public class quiz12912 {
    public static void main(String[] args) {
        long solution = solution(5, 3);
        System.out.println(solution);
    }

    public static long solution(int a, int b) {
        long sumTotal=0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a == b) {
            return a;
        }

        for (int i = a; i < b+1; i++) {
            sumTotal = sumTotal + i;
        }
        return sumTotal;
    }
}
