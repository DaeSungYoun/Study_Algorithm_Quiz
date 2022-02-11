public class quiz12922 {

    public static void main(String[] args) {
        String solution = solution(3);
        System.out.println(solution);
    }

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sb.append("박");
            }
            else{
                sb.append("수");
            }
        }
        return sb.toString();
    }

}
