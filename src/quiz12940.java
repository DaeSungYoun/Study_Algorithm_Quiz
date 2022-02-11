import java.util.Arrays;

public class quiz12940 {
    public static void main(String[] args) {
        int[] solution = solution(3, 12);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int n, int m) {
        int min = gcd(n, m);
        int max = (n * m) / min;

        int[] answer = {min, max};

        return answer;
    }//test

    public static int gcd(int n, int m) {
        if(m == 0) return n;
        else return gcd(m, n % m);
    }
}
