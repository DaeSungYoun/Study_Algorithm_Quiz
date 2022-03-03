package programmers.lvl1;

import java.util.*;

public class quiz67256 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String solution = solution(numbers, hand);
        System.out.println(solution);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> numberMappingHand = new HashMap<>();
        String leftPosition = "*";
        String rightPosition = "#";

        numberMappingHand.put("1", "L");
        numberMappingHand.put("4", "L");
        numberMappingHand.put("7", "L");
        numberMappingHand.put("3", "R");
        numberMappingHand.put("6", "R");
        numberMappingHand.put("9", "R");

        Map<String, xy> numberPosition = new HashMap<>();
        numberPosition.put("1", new xy(1, 1));
        numberPosition.put("2", new xy(2, 1));
        numberPosition.put("3", new xy(3, 1));
        numberPosition.put("4", new xy(1, 2));
        numberPosition.put("5", new xy(2, 2));
        numberPosition.put("6", new xy(3, 2));
        numberPosition.put("7", new xy(1, 3));
        numberPosition.put("8", new xy(2, 3));
        numberPosition.put("9", new xy(3, 3));
        numberPosition.put("*", new xy(1, 4));
        numberPosition.put("0", new xy(2, 4));
        numberPosition.put("#", new xy(3, 4));

        for (int i = 0; i < numbers.length; i++) {
            String targetNumber = String.valueOf(numbers[i]);

            if (Objects.nonNull(numberMappingHand.get(targetNumber))) {
                sb.append(numberMappingHand.get(targetNumber));
                if (numberMappingHand.get(targetNumber) == "L") {
                    leftPosition = targetNumber;
                }
                else{
                    rightPosition = targetNumber;
                }
            }
            else{
                int left = Math.abs(numberPosition.get(targetNumber).getX() - numberPosition.get(leftPosition).getX()) + Math.abs(numberPosition.get(targetNumber).getY() - numberPosition.get(leftPosition).getY());
                int right = Math.abs(numberPosition.get(targetNumber).getX() - numberPosition.get(rightPosition).getX()) + Math.abs(numberPosition.get(targetNumber).getY() - numberPosition.get(rightPosition).getY());

                if (left > right) {
                    sb.append("R");
                    rightPosition = targetNumber;
                }
                else if(left < right){
                    sb.append("L");
                    leftPosition = targetNumber;
                }
                else if(left == right){
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftPosition = targetNumber;
                    }
                    else{
                        sb.append("R");
                        rightPosition = targetNumber;
                    }
                }
            }
        }
        return sb.toString();
    }

    static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
