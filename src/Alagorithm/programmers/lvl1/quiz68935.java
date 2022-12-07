package Alagorithm.programmers.lvl1;

public class quiz68935 {
    public static void main(String[] args) {
        int n = 45;
        int solution = solution(n);
        System.out.println(solution);
    }

    public static int solution(int n) {
        String ans = "";
        while(n != 0) {
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans, 3);
    }
}
