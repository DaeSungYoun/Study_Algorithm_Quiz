package Alagorithm.programmers.lvl1;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086?language=java
 */
public class Quiz142086 {
    public static void main(String[] args) {
//        String n = "banana";
        String n = "foobar";
        System.out.println(solution(n));
    }

    public static int[] solution(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                Integer idx = map.get(chars[i]);
                map.put(chars[i], i);
                list.add(i - idx);
            } else {
                list.add(-1);
                map.put(chars[i], i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
