package builderPattern;

public class Student {
    private long id;
    private String name;
    private String major;
    private int age;
    private String address;

    public Student() {}

    Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        private long id;
        private String name;
        private String major;
        private int age;
        private String address;

        public Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder major(String value) {
            major = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder address(String value) {
            address = value;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
//
//
//(int a) -> {System.out.println(a)}
//(a) -> {System.out.println(a)}
//a -> System.out.println(a)
//
//(int a, int b) -> {System.out.println(a + b)}
//(a, b) -> System.out.println(a +b)
//
//(a, b) -> {return a + b}
//(a, b) -> a + b
//



