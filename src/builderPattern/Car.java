package builderPattern;

public class Car {
    private String brand;
    private String engine;
    private String name;
    private String tire;
    private int capacity;
    private int price;
    Car(Builder builder) {
        this.brand = builder.brand;
        this.engine = builder.engine;
        this.name = builder.name;
        this.tire = builder.tire;
        this.capacity = builder.capacity;
        this.price = builder.price;
    }
    public static class Builder {
        private String brand;
        private String engine;
        private String name;
        private String tire;
        private int capacity;
        private int price;

        // 필수적인 필드 : brand
        public Builder(String brand) {
            this.brand = brand;
        }
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder tire(String tire) { this.tire = tire; return this; } public Builder capacity(int capacity) { this.capacity = capacity; return this; } public Builder price(int price) { this.price = price; return this; } public Car build() { return new Car(this); } } }
