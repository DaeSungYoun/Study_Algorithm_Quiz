public class quiz82612 {
    public static void main(String[] args) {
        long solution = solution(3, 20, 4);
        System.out.println(solution);
    }

    public static long solution(int price, int money, int count) {
        long sumPrice = 0;

        for (int i = 1; i <= count; i++) {
            sumPrice = sumPrice + (price * i);
        }

        if (money >= sumPrice) {
            return 0;
        }
        else{
            return sumPrice - money;
        }
    }
}
