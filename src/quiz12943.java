/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class quiz12943 {
    public static void main(String[] args) {
        int solution = solution(626331);
        System.out.println(solution);
    }

    public static int solution(int num) {
        int totalCount = 500;
        int playCount = 0;
        long playNum = num;

        while (playNum != 1 && playCount <= totalCount) {
            playCount = playCount + 1;
            playNum = (playNum % 2 == 0) ? playNum / 2 : (playNum * 3) + 1;
        }

        if (playCount > 500) {
            return -1;
        }

        return playCount;
    }
}
