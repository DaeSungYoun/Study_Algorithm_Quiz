package Alagorithm.programmers.lvl2;

import java.util.*;

public class quiz92342 {
    public static void main(String[] args) {
        int n = 10;
//        int[] info = {1,0,0,0,0,0,0,0,0,0,0};
        int[] info = {0,0,0,0,0,0,0,0,3,4,3};
        int[] solution = solution(n, info);
//        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int leftoverArrow, int[] info) {
        int apeachScore = 0;
        int lionScore = 0;
        int[] lionScoreList = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < info.length; i++) {
            if (info[i] > 0) {
                apeachScore += (10-i);
            }
        }

        for (int i = 0; i < info.length; i++) {
            System.out.println("=======================================");
            System.out.println("잔여화살 : " + String.valueOf(leftoverArrow));

            //잔여화살이 없으면 끝
            if (leftoverArrow == 0) {
                System.out.println("잔여화살 없음");
                break;
            }

            System.out.println("어피치가 " + String.valueOf(10-i) + "점 맞춘 화살 수 : " + String.valueOf(info[i]));
            if (info[i] > 0) {
                //어피치가 2발 맞춘 점수는 포기(먹을 필요없음 낭비임), 0점일 경우에만 먹음
                if (info[i] > 1) {
                    if (i == 10) {
                        lionScoreList[i] = leftoverArrow;
                        leftoverArrow = 0;
                    }else{
                        System.out.println("어피치가 2발 맞춰서 포기!");
                    }
                }else{
                    //어피치가 1발 쏜 점수를 먹으려면 2발 쏴야함
                    if (leftoverArrow > 1) {
                        System.out.println("어피치가 1발 맞춘 점수여서 2발 쏴서 가로채기!");
                        apeachScore -= (10 - i);
                        lionScore += (10 - i);
                        lionScoreList[i] = 2;
                        leftoverArrow = leftoverArrow - 2;
                    }
                }
            }else {
                if (leftoverArrow > 0) {
                    lionScore += (10 - i);
                    lionScoreList[i] = 1;
                    leftoverArrow = leftoverArrow - 1;
                }
            }
            System.out.println("");
            System.out.println(Arrays.toString(lionScoreList));
            System.out.println("어피치 점수 : " + String.valueOf(apeachScore) + ", 라이언 점수 : " + String.valueOf(lionScore));
        }

        System.out.println("마지막 정리");
        System.out.println("잔여화살 : " + String.valueOf(leftoverArrow));
        System.out.println("어피치 점수 : " + String.valueOf(apeachScore) + ", 라이언 점수 : " + String.valueOf(lionScore));

        if (apeachScore >= lionScore) {
            int[] a = {-1};
            return a;
        }else{
            if (leftoverArrow > 0) {
                lionScoreList[10] = lionScoreList[10] + leftoverArrow;
            }
        }

        return lionScoreList;
    }
}
