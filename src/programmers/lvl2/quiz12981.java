package programmers.lvl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz12981 {
    public static void main(String[] args) {
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        int[] solution = solution(n, words);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int n, String[] words) {
        int wordsCount = 0;
        int playTurnCount = 1;
        String prevWord;
        List<String> wordHist = new ArrayList<>();

        while (true) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + "번 사람 차례 : " + words[wordsCount]);

                if (wordHist.contains(words[wordsCount])) {
                    System.out.println("나왔던 단어! 게임 종료!");
                    return new int[]{i, playTurnCount};
                }

                if (wordHist.size() > 0) {
                    prevWord = wordHist.get(wordHist.size() - 1);
                    if (prevWord.charAt(prevWord.length() - 1) != words[wordsCount].charAt(0)) {
                        System.out.println("땡! 틀렸음! 전에 사람 단어 : " +  prevWord + " 지금 말한 단어 : " + words[wordsCount]);
                        return new int[]{i, playTurnCount};
                    }
                }

                wordHist.add(words[wordsCount]);
                wordsCount++;

                if (words.length == wordsCount) {
                    System.out.println("틀린사람 없음! 게임 종료!");
                    return new int[]{0, 0};
                }
            }
            playTurnCount++;
        }
    }
}
