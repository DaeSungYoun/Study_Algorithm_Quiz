package programmers.lvl1;

import java.util.ArrayList;
import java.util.List;

public class quiz77884 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int solution = solution(left, right);
        System.out.println(solution);
    }

    public static int solution(int left, int right) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2;
        List<Integer> plusList = new ArrayList<>();
        List<Integer> minusList = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            list.add(i);
        }

        for (Integer num : list) {
            list2 = new ArrayList<>();
            for (int i = 1; i <= num; i++) {
                if ((num % i) == 0) {
                    list2.add(i);
                }
            }
            if (list2.size() % 2 == 0) {
                plusList.add(num);
            }
            else{
                minusList.add(num);
            }
        }

        return plusList.stream().mapToInt(Integer::intValue).sum() - minusList.stream().mapToInt(Integer::intValue).sum();
    }
}
