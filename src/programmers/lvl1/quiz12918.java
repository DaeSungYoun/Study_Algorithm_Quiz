package programmers.lvl1;

public class quiz12918 {
    public static void main(String[] args) {
        boolean a234 = solution("12 34");
        System.out.println(a234);
    }

    public static boolean solution(String s) {
        boolean result = true;
        if (s.length() == 4 || s.length() == 6) {
            String[] split = s.split("");
            for (String str : split) {
                if (!Character.isDigit(str.charAt(0))) {
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return result;
    }
}
