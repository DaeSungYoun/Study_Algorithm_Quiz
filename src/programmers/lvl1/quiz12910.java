package programmers.lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz12910 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int[] solution = solution(arr, 1);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            int[] resultArray = {-1};
            return resultArray;
        }
        else{
            return list.stream().sorted().mapToInt(i -> i).toArray();
        }
    }
}
