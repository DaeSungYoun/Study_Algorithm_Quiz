package Alagorithm.programmers.lvl1;

import java.util.*;
import java.util.stream.Collectors;

public class quiz92334 {
    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] solution = solution(id_list, report, k);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<String> distinctReportList = Arrays.stream(report).distinct().collect(Collectors.toList());
        Map<String, HashSet<String>> attackReport = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        for (String id : id_list) {
            HashSet<String> hashSet = new HashSet<>();
            reportCount.put(id, 0);
            attackReport.put(id, hashSet);
        }

        for (String value : distinctReportList) {
            String[] a = value.split(" ");
            attackReport.get(a[0]).add(a[1]);
            reportCount.put(a[1], reportCount.get(a[1]) + 1);
        }

        for (int i = 0; i < id_list.length; i++) {
            int count = 0;
            HashSet<String> hashSet = attackReport.get(id_list[i]);
            for (String value : hashSet) {
                if (reportCount.get(value) >= k) {
                    count ++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
