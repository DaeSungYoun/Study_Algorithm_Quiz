import java.util.*;

public class quiz68644 {
    public static void main(String[] args) {
        int[] numbers = {5, 0, 2, 7};
        int[] solution = solution(numbers);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                resultSet.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> targetList = new ArrayList<>(resultSet);

        return targetList.stream().sorted().mapToInt(i -> i).toArray();
    }
}
