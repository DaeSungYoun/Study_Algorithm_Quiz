package Alagorithm.programmers.lvl1;

import java.util.ArrayList;
import java.util.List;

public class quiz17682 {
    public static void main(String[] args) {
//        int d = solution("1S2D*3T");
        int d = solution("1T2D3D#");
        System.out.println(d);
    }

    public static int solution(String dartResult) {
        char a;
        int totalSum = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            a = dartResult.charAt(i);
            if (a == '*' || a == '#') {
                list.add(String.valueOf(a));
            } else if (a == 'S' || a == 'D' || a == 'T' ) {
                sb.append(a);
                list.add(String.valueOf(calc(sb.toString())));
                sb = new StringBuilder();
            } else {
                sb.append(a);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.size() == 6) {
                //1, *, 2, *, 3, *
                if (i == 1) {
                    if (list.get(i).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                    } else {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * -1));
                    }
                } else if (i == 3) {
                    if (list.get(i).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * 2));
                    } else {
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * -1));
                    }
                } else if (i == 5) {
                    if (list.get(i).equals("*")) {
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * 2));
                        list.set(4, String.valueOf(Integer.parseInt(list.get(4)) * 2));
                    } else {
                        list.set(4, String.valueOf(Integer.parseInt(list.get(4)) * -1));
                    }
                }
            } else if (list.size() == 5) {
                /*
                    1, 1, *, 3, *
                    1, *, 1, *, 1
                    1, *, 1, 1, *
                 */
                if (i == 1) {
                    if (list.get(1).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                    } else if (list.get(1).equals("#")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * -1));
                    }
                } else if (i == 2) {
                    if (list.get(2).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                        list.set(1, String.valueOf(Integer.parseInt(list.get(1)) * 2));
                    } else if (list.get(2).equals("#")) {
                        list.set(1, String.valueOf(Integer.parseInt(list.get(1)) * -1));
                    }
                } else if (i == 3) {
                    if (list.get(3).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * 2));
                    } else if (list.get(3).equals("#")) {
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * -1));
                    }
                } else if (i == 4) {
                    if (list.get(4).equals("*")) {
                        if (list.get(2).equals("*") || list.get(2).equals("#")) {
                            list.set(1, String.valueOf(Integer.parseInt(list.get(1)) * 2));
                            list.set(3, String.valueOf(Integer.parseInt(list.get(3)) * 2));
                        } else {
                            list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * 2));
                            list.set(3, String.valueOf(Integer.parseInt(list.get(3)) * 2));
                        }
                    } else if (list.get(4).equals("#")) {
                        list.set(3, String.valueOf(Integer.parseInt(list.get(3)) * -1));
                    }
                }
            } else if (list.size() == 4){
                /*
                    1, *, 1, 1
                    1, 1, *, 1
                    1, 1, 1, *
                 */
                if (i == 1) {
                    if (list.get(1).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                    } else if (list.get(1).equals("#")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * -1));
                    }
                } else if (i == 2) {
                    if (list.get(2).equals("*")) {
                        list.set(0, String.valueOf(Integer.parseInt(list.get(0)) * 2));
                        list.set(1, String.valueOf(Integer.parseInt(list.get(1)) * 2));
                    } else if (list.get(2).equals("#")) {
                        list.set(1, String.valueOf(Integer.parseInt(list.get(1)) * -1));
                    }
                } else if (i == 3) {
                    if (list.get(3).equals("*")) {
                        list.set(1, String.valueOf(Integer.parseInt(list.get(1)) * 2));
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * 2));
                    } else if (list.get(3).equals("#")) {
                        list.set(2, String.valueOf(Integer.parseInt(list.get(2)) * -1));
                    }
                }
            }
        }

        for (String aa : list) {
            if (isStringInteger(aa)) {
                totalSum = totalSum + Integer.parseInt(aa);
            }
        }

        return totalSum;
    }

    public static int calc(String value) {
        String a = "";
        String b = "";
        if (value.length() == 2) {
            a = value.substring(0, 1);
            b = value.substring(1, 2);
        } else {
            a = value.substring(0, 2);
            b = value.substring(2, 3);
        }

        switch (b) {
            case "S":
                return Integer.parseInt(a);
            case "D":
                return Integer.parseInt(a) * Integer.parseInt(a);
            case "T":
                return Integer.parseInt(a) * Integer.parseInt(a) * Integer.parseInt(a);
        }
        return 0;
    }

    public static boolean isStringInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
