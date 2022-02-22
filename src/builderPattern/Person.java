package builderPattern;

public class Person {
    private String name;
    private int age;
    private String address;

    Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        address = builder.address;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int valu) {
            age = valu;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
