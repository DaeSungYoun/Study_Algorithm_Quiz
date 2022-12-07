package Alagorithm.programmers.lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] arr) {
        Integer tempNumber = null;
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (tempNumber == null) {
                list.add(i);
                tempNumber = i;
            } else if (tempNumber == i) {
                continue;
            } else {
                list.add(i);
                tempNumber = i;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
