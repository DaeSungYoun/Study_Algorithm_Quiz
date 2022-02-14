public class quiz87389 {
    public static void main(String[] args) {
        int solution = solution(12);
        System.out.println(solution);
    }

    public static int solution(int n) {
        int result = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                result = i;
                break;
            }
        }

        return result;
    }
}
