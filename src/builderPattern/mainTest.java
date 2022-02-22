package builderPattern;

public class mainTest {
    public static void main(String[] args) {
        Car car = new Car.Builder("현대").build();

        Person person = new Person.Builder("ddd").address("asdfadsf").age(2423).build();

        System.out.println();
    }
}
