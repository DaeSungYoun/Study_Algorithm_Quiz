package Alagorithm.programmers.lvl1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 */
public class quiz12950 {
    public static void main(String[] args) {
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int rowCount = arr1.length;
        int ColumnCount = arr1[0].length;

        int[][] answer = new int[rowCount][ColumnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < ColumnCount; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
