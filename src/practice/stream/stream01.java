package practice.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream01 {
    public static void main(String[] args) {
        List<HashMap<Object, Object>> list = new ArrayList<>();
        list.add(new HashMap<Object, Object>() {{
            put("name", "영희");
            put("jum", 95);
        }});
        list.add(new HashMap<Object, Object>() {{
            put("name", "영수");
            put("jum", 80);
        }});
        list.add(new HashMap<Object, Object>() {{
            put("name", "민수");
            put("jum", 75);
        }});
        list.add(new HashMap<Object, Object>() {{
            put("name", "철수");
            put("jum", 79);
        }});
        list.add(new HashMap<Object, Object>() {{
            put("name", "민희");
            put("jum", 85);
        }});
        list.add(new HashMap<Object, Object>() {{
            put("name", "유리");
            put("jum", 40);
        }});

        list.stream()
                .sorted((s2, s1) -> Integer.compare((int) s1.get("jum"), (int) s2.get("jum")))
                .forEach(System.out::println);

        System.out.println("----------------");
        list.stream()
                .sorted((s2, s1) -> s1.get("name").toString().compareTo(s2.get("name").toString()))
                .forEach(System.out::println);

//
//        System.out.println(list);
//        list.forEach(System.out::println);
//
//        System.out.println("00000");
//        list.stream().filter(i -> (int) i.get("jum") > 80).forEach(System.out::println);
//
//        System.out.println("00000");
//        list.stream().filter(i -> i.get("name").toString().contains("영")).forEach(System.out::println);
//
//        System.out.println("00000");
//        List<String> animals = Arrays.asList("dog", "cat", "dog", "cat", "monkey", "rabbit");
//        Stream<String> filter = animals.stream().distinct();
//        filter.forEach(System.out::println);

//        Student[] sArr = {
//                new Student("철수", 79)
//                , new Student("영희", 95)
//                , new Student("영수", 80)
//                , new Student("민희", 85)
//                , new Student("유리", 40)
//                , new Student("민수", 75)};
//
//        Stream<Student> sorted = Stream.of(sArr).sorted(Comparator.comparing(Student::getJum));
//        sorted.forEach(System.out::println);
//
//        Stream<Student> sorted1 = Stream.of(sArr).sorted(Comparator.comparing(Student::getJum));
//        sorted1.forEach(System.out::println);

        List<String> words = Arrays.asList("book", "desk", "keyboard", "mouse", "cup");
        long o = words.stream().filter(s -> s.contains("o")).count();

        List<Integer> cal = Arrays.asList(49, 123, 22, 55, 21);
        int asInt = cal.stream().mapToInt(i -> i).max().getAsInt();

        Integer integer = cal.stream().min(Comparator.comparing(i -> i)).get();
        System.out.println(integer);


    }
}
