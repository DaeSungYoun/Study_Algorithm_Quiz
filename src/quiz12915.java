import java.util.*;

public class quiz12915 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcdgg", "abcdff"};
        String[] solution = solution(strings, 2);

        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();

        for (String str : strings) {
            list.add(str.charAt(n) + str);
        }

        List<String> resultList = new ArrayList<>();
        list.stream()
                .sorted()
                .forEach(s -> resultList.add(s.substring(1)));

        return resultList.toArray(new String[resultList.size()]);
    }
}