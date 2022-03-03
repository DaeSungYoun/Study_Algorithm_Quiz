package programmers.lvl1;

import java.util.*;
import java.util.stream.Collectors;

public class quiz1845 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        int solution = solution(nums);
        System.out.println(solution);
    }

    public static int solution(int[] nums) {
        int getMonCount = nums.length / 2;

        List<Integer> collect = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());

        if (getMonCount >= collect.size()) {
            return collect.size();
        }
        else{
            return getMonCount;
        }
    }
}
