package Alagorithm.programmers.lvl2;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class quiz12953 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        int solution = solution(arr);
        System.out.println(solution);
    }

    public static int solution(int[] arr) {
        IntStream stream = Arrays.stream(arr);
        OptionalInt max1 = stream.max();
        int asInt = max1.getAsInt();
        System.out.println(asInt);

        Stream<Integer> boxed = Arrays.stream(arr).boxed();

        Optional<Integer> max = Arrays.stream(arr).boxed().max(Integer::compareTo);
        int maxNum = max.get();
        int cnt = 1;
        int multiple = 0;

        while (true) {
            boolean valid = true;
            multiple = maxNum * cnt;

            for (int num : arr) {
                if (multiple % num != 0) {
                    valid = false;
                }
            }
            cnt++;

            if (valid) {
                break;
            }
        }

        return multiple;
    }
}
