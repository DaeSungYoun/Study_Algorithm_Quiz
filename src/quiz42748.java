import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class quiz42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = solution(array, commands);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int i = 0;
        int j = 0;
        int k = 0;
        List<Integer> collect = null;
        int[] array2 = new int[commands.length];

        for (int b = 0; b < commands.length; b++) {
            i = commands[b][0];
            j = commands[b][1];
            k = commands[b][2];
            collect = new ArrayList<>();

            for (int l = 0; l < (j - i + 1); l++) {
                collect.add(array[i - 1 + l]);
            }

            Collections.sort(collect);
            array2[b] = collect.get(k-1);
        }

        return array2;
    }
}
