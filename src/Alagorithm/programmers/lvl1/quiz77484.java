package Alagorithm.programmers.lvl1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class quiz77484 {
    public static void main(String[] args) {
        int[] lottos = {0,0,0,0,0,0};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] solution = solution(lottos, win_nums);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int maxGrade;
        int minGrade;

        List<int[]> mashUpList = new ArrayList<>();
        mashUpList.add(lottos);
        mashUpList.add(win_nums);

        int count = (int) mashUpList.stream().flatMapToInt(i -> Arrays.stream(i)).filter(i -> i > 0).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream()
                .filter(p -> p.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .stream().count();

        int count1 = (int) Arrays.stream(lottos).boxed().collect(Collectors.toList()).stream().filter(i -> i == 0).count();

        minGrade = grade(count);
        maxGrade = grade(count + count1);

        int[] answer = {maxGrade, minGrade};
        return answer;
    }

    public static int grade(int count) {
        int grade = 0;
        switch (count) {
            case 6 :
                grade = 1;
                break;
            case 5 :
                grade = 2;
                break;
            case 4 :
                grade = 3;
                break;
            case 3 :
                grade = 4;
                break;
            case 2 :
                grade = 5;
                break;
            default:
                grade = 6;
                break;
        }
        return grade;
    }
}
