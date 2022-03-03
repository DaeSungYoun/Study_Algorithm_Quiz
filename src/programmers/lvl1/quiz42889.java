package programmers.lvl1;

import java.util.*;
import java.util.stream.Collectors;

public class quiz42889 {
    public static void main(String[] args) {
        int N = 4;
        int[] stages = {4,4,4,4,4};
        int[] solution = solution(N, stages);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int N, int[] stages) {
        Map<Integer, Double> stageFailRate = new HashMap<>();
        List<Integer> stagesList = Arrays.stream(stages).boxed().collect(Collectors.toList());
        int[] answer = new int[N];

        for (int i = 1; i <= N; i++) {
            int frequency = Collections.frequency(stagesList, i);

            if (frequency == 0) {
                stageFailRate.put(i, 0.0);
            }
            else{
                stageFailRate.put(i, (double) frequency / stagesList.size());
            }
            stagesList.removeAll(Arrays.asList(Integer.valueOf(i)));
        }

        int lowKey = 0;
        double maxValue = -1;
        for (int i = 0; i < N; i++) {
            lowKey = 0;
            maxValue = -1;
            for (int key : stageFailRate.keySet()) {
                if (maxValue < stageFailRate.get(key)) {
                    maxValue = stageFailRate.get(key);
                    lowKey = key;
                }
            }
            answer[i] = lowKey;
            stageFailRate.remove(lowKey);
        }

        return answer;
    }
}
