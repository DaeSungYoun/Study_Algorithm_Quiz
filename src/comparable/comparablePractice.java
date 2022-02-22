package comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparablePractice {
    public static void main(String[] args) {
        MyInteger[] arr = new MyInteger[10];

        String a = "";
        a.compareTo("asdf");

        List<String> ddd = null;


        // 객체 배열 초기화 (랜덤 값으로)
        for(int i = 0; i < 10; i++) {
            arr[i] = new MyInteger((int)(Math.random() * 100));
        }

        // 정렬 이전
        System.out.print("정렬 전 : ");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i].value + " ");
        }
        System.out.println();

        Arrays.sort(arr);


        // 정렬 이후
        System.out.print("정렬 후 : ");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i].value + " ");
        }
        System.out.println();

//        student s1 = new student(17, 2);
//        student s2 = new student(20, 3);
//
//        int aa = s1.compareTo(s2);
//        System.out.println(aa);
//        double x = s1.rectangle.getX();
//        System.out.println(x);
//
//        int[] aaaaa = {4, 3, 7, 55, 2, 1, 2, 4, 5};
//        System.out.println(Arrays.toString(aaaaa));
//        Arrays.sort(aaaaa);
//        System.out.println(Arrays.toString(aaaaa));
    }

    static Comparator<MyInteger> comp = new Comparator<MyInteger>() {
        @Override
        public int compare(MyInteger o1, MyInteger o2) {
            return o1.value - o2.value;
        }
    };
}

class MyInteger implements Comparable<MyInteger>{
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyInteger o) {
        return o.value - this.value;
    }
}
