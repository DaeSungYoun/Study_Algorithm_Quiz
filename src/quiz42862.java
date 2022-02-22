import java.util.*;

public class quiz42862 {
    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        int solution = solution(n, lost, reserve);
        System.out.println(solution);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Map<String, Integer> students = new HashMap<>();
        for (int i = 0; i < n; i++) {
            students.put(String.valueOf(i + 1), 1);
        }

        for (int i = 0; i < lost.length; i++) {
            students.put(String.valueOf(lost[i]), students.get(String.valueOf(lost[i])) - 1);
        }

        for (int i = 0; i < reserve.length; i++) {
            students.put(String.valueOf(reserve[i]), students.get(String.valueOf(reserve[i])) + 1);
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(String.valueOf(i + 1)) == 0) {
                if (Objects.nonNull(students.get(String.valueOf(i))) && students.get(String.valueOf(i)) > 1) {
                    students.put(String.valueOf(i), students.get(String.valueOf(i)) - 1);
                    students.put(String.valueOf(i+1), students.get(String.valueOf(i+1)) + 1);
                }
                else if (Objects.nonNull(students.get(String.valueOf(i + 2))) && students.get(String.valueOf(i + 2)) > 1) {
                    students.put(String.valueOf(i+2), students.get(String.valueOf(i+2)) - 1);
                    students.put(String.valueOf(i+1), students.get(String.valueOf(i+1)) + 1);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(String.valueOf(i + 1)) > 0) {
                answer++;
            }
        }

        return answer;
    }
}
