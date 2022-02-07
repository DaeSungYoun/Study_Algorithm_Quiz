import java.util.Scanner;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
 */
public class quiz12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        print(a, b);
    }

    public static void print(int n, int m) {
        StringBuilder stringBuilder;

        for (int i = 0; i < m; i++) {
            stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                stringBuilder.append('*');
            }
            System.out.println(stringBuilder);
        }
    }
}
