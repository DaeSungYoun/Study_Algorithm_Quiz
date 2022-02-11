import java.util.ArrayList;
import java.util.List;

public class quiz12932 {
    public static void main(String[] args) {
        int[] solution = solution(48394859);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(long n) {
        String reverseString = new StringBuffer(String.valueOf(n)).reverse().toString();

        List<Integer> list = new ArrayList<>();

        for (char c : reverseString.toCharArray()) {
            list.add(Character.getNumericValue(c));
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
