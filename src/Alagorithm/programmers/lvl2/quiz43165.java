package Alagorithm.programmers.lvl2;

public class quiz43165 {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        int solution = solution(numbers, target);
        System.out.println(solution);
    }
    public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }

    public static void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (target == sum) {
                answer++;
            }
        }else{
            dfs(numbers, target, depth + 1, sum + numbers[depth]);
            dfs(numbers, target, depth + 1, sum - numbers[depth]);
        }
    }
}
