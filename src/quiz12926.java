import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz12926 {
    static final List<String> lowerArray = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    static final List<String> upperArray = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    static final int maxCount = 26;

    public static void main(String[] args) {
        String asdf = solution("z", 1);
        System.out.println(asdf);
    }

    public static String solution(String s, int n) {
        String[] split = s.split("");

        StringBuilder sb = new StringBuilder();

        for (String str : split) {
            if (str.contains(" ")) {
                sb.append(" ");
            }
            //대문자 여부 확인
            else if (Character.isUpperCase(str.charAt(0))) {
                sb.append(strReturn(true, str, n));
            }
            else{
                sb.append(strReturn(false, str, n));
            }
        }

        return sb.toString();
    }
    public static String strReturn(boolean stringType, String str, int n) {
        if (stringType) {
            int i = upperArray.indexOf(str);
            if (n + i > 25) {
                return upperArray.get(n + i - 26);
            }
            else{
                return upperArray.get(n + i);
            }
        }
        else{
            int i = lowerArray.indexOf(str);
            if (n + i > 25) {
                return lowerArray.get(n + i - 26);
            }
            else{
                return lowerArray.get(n + i);
            }
        }
    }
}
