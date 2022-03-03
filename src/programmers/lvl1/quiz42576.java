package programmers.lvl1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class quiz42576 {
    public static void main(String[] args) {
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String solution = solution(participant, completion);
        System.out.println(solution);
    }

    public static String solution(String[] participant, String[] completion) {
        List<String> participantList = Arrays.stream(participant).sorted().collect(Collectors.toList());
        List<String> completionList = Arrays.stream(completion).sorted().collect(Collectors.toList());

        for (int i = 0; i < completionList.size(); i++) {
            if (!participantList.get(i).equals(completionList.get(i))) {
                return participantList.get(i);
            }
        }
        return participantList.get(participant.length - 1);
    }
}
