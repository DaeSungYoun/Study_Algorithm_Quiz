package programmers.lvl1;

public class quiz72410 {
    public static void main(String[] args) {
        String new_id = "-_.~!@#$%^&*()=+[{]}:?,<>/";
        String solution = solution(new_id);
        System.out.println(solution);
    }

    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();

        String match = "[^0-9a-z-_.]";
        new_id = new_id.replaceAll(match, "");

        StringBuilder sb = new StringBuilder();

        String str = "";
        String lastStr = "";

        for (int i = 0; i < new_id.length(); i++) {
            str = new_id.substring(i, i+1);

            if (str.equals(lastStr)) {
                continue;
            }

            lastStr = str;
            sb.append(str);
        }
        new_id = sb.toString();

        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }

        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }


        if (new_id.equals("")) {
            new_id = "a";
        }

        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);

            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id = new_id + new_id.substring(new_id.length() - 1);
            }
        }

        return new_id;
    }
}
