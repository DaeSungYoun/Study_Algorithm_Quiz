import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class quiz12901 {

    final static List<Integer> monthDay = new ArrayList<Integer>();
    final static Map<String, String> calendarMap = new HashMap<>();

    public static void main(String[] args) {
        String solution = solution(5, 24);
        System.out.println(solution);
    }

    public static String solution(int a, int b) {
        monthDay.add(31);
        monthDay.add(29);
        monthDay.add(31);
        monthDay.add(30);
        monthDay.add(31);
        monthDay.add(30);
        monthDay.add(31);
        monthDay.add(31);
        monthDay.add(30);
        monthDay.add(31);
        monthDay.add(30);
        monthDay.add(31);

        String month = "";
        String day = "";
        String dayOfTheWeek = "";
        int dayCount = 0;

        for (int i = 0; i < monthDay.size(); i++) {
            month = String.valueOf((i + 1));

            for (int j = 1; j <= monthDay.get(i); j++) {
                day = String.valueOf(j);

                if (dayCount == 0) {
                    dayOfTheWeek = "FRI";
                } else if (dayCount == 1) {
                    dayOfTheWeek = "SAT";
                } else if (dayCount == 2) {
                    dayOfTheWeek = "SUN";
                } else if (dayCount == 3) {
                    dayOfTheWeek = "MON";
                } else if (dayCount == 4) {
                    dayOfTheWeek = "TUE";
                } else if (dayCount == 5) {
                    dayOfTheWeek = "WED";
                } else if (dayCount == 6) {
                    dayOfTheWeek = "THU";
                }

                dayCount++;
                if (dayCount > 6) {
                    dayCount = 0;
                }

                calendarMap.put(month + day, dayOfTheWeek);
            }
        }

        month = String.valueOf(a);
        day = String.valueOf(b);

        return calendarMap.get(month + day);
    }
}
