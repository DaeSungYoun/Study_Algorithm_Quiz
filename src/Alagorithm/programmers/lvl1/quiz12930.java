package Alagorithm.programmers.lvl1;

public class quiz12930 {
    public static void main(String[] args) {
        String asdf = solution("moon fight six random");
        System.out.println(asdf);
    }

    public static String solution(String s) {
        String[] split = s.split("");

        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (String str : split) {
            if (str.contains(" ")) {
                sb.append(str.toUpperCase());
                index = 0;
            }
            else if (index == 0) {
                sb.append(str.toUpperCase());
                index++;
            }
            else if (index % 2 == 0){
                sb.append(str.toUpperCase());
                index++;
            }
            else{
                sb.append(str.toLowerCase());
                index++;
            }
        }
        return sb.toString();
    }
}
