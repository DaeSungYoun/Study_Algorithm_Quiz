package programmers.lvl1;

public class quiz12948 {
    public static void main(String[] args) {
        String solution = solution("1234567");
    }

    public static String solution(String phone_number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < (phone_number.length() - 4); i++) {
            stringBuilder.append("*");
        }

        stringBuilder.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));

        return stringBuilder.toString();
    }
}
