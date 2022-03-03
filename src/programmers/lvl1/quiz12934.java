package programmers.lvl1;

public class quiz12934 {
    public static void main(String[] args) {
        long solution = solution(121);
        System.out.println(solution);
    }

    public static long solution(long n) {
        double result = Math.sqrt(n);

        if (result % 1 == 0) {
            return (long) Math.pow(result + 1, 2);
        }
        else{
            return -1;
        }
    }
}
