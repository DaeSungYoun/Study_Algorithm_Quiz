public class quiz12903 {
    public static void main(String[] args) {
        String asfd = solution("asfdg");
        System.out.println(asfd);
    }


    public static String solution(String s) {
        int halfIndex = s.length() / 2;
        if (s.length() % 2 == 0) {
            return s.substring(halfIndex - 1, halfIndex + 1);
        }
        else{
            return s.substring(halfIndex, halfIndex + 1);
        }
    }
}
