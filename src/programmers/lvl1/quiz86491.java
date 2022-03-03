package programmers.lvl1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class quiz86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = solution(sizes);
        System.out.println(solution);
    }

    public static int solution(int[][] sizes) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int[] num : sizes) {
            if (num[0] >= num[1]) {
                list1.add(num[0]);
                list2.add(num[1]);
            }
            else{
                list1.add(num[1]);
                list2.add(num[0]);
            }
        }

        return Collections.max(list1) * Collections.max(list2);
    }
}
