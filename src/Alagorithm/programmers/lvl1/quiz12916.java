package Alagorithm.programmers.lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class quiz12916 {
    public static void main(String[] args) {
        boolean solution = solution("pPopooyY");
        System.out.println(solution);
    }

    public static boolean solution(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        int pCount = list.stream().filter(h -> h.toUpperCase().equals("P")).collect(Collectors.toList()).size();
        int yCount = list.stream().filter(h -> h.toUpperCase().equals("Y")).collect(Collectors.toList()).size();

        return (pCount == yCount ? true : false);
    }
}
