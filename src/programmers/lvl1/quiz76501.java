package programmers.lvl1;

public class quiz76501 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int solution = solution(absolutes, signs);
        System.out.println(solution);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        int a = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                a = 1;
            }
            else{
                a = -1;
            }

            sum = sum + (absolutes[i] * a);
        }

        return sum;
    }
}
