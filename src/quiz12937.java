public class quiz12937 {
    public static void main(String[] args) {
        String solution = solution(2);
        System.out.println(solution);
    }

    public static String solution(int num) {
        if (num == 0) {
            return "Even";
        }
        else if (num % 2 == 0) {
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
