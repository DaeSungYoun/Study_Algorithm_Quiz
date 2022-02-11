public class quiz12928 {
    public static void main(String[] args) {
        int solution = solution(12);
        System.out.println(solution);
    }

    public static int solution(int n) {
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                totalSum = totalSum + i;
            }
        }

        return totalSum;
    }
}
