package Alagorithm.programmers.lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz12935 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] arr) {
        int asInt = Arrays.stream(arr).min().getAsInt();

        List<Integer> resultList = new ArrayList<>();

        for (int number : arr) {
            if (number != asInt) {
                resultList.add(number);
            }
        }

        if (resultList.size() == 0) {
            resultList.add(-1);
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
