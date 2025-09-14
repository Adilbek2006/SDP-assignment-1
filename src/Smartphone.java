public class Smartphone {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;
    private final int price;
    private final String cpu;
    private final int memory;
    private final String os;
    private final String ram;

    public Smartphone(Builder build) {
        this.brand = build.brand;
        this.model = build.model;
        this.color = build.color;
        this.year = build.year;
        this.price = build.price;
        this.cpu = build.cpu;
        this.memory = build.memory;
        this.os = build.os;
        this.ram = build.ram;
    }



    public static class Builder {
        private String brand;
        private String model;
        private String color;
        private int year;
        private int price;
        private String cpu;
        private int memory;
        private String os;
        private String ram;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        public Builder price(int price) {
            this.price = price;
            return this;
        }
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder memory(int memory) {
            this.memory = memory;
            return this;
        }
        public Builder os(String os) {
            this.os = os;
            return this;
        }
        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Smartphone build() {
            return new Smartphone(this);
        }

    }
    @Override
    public String toString() {
        return "Smartphone brand = " + brand + ", model = " + model + ", color = " + color
                + ", year = " + year + ", price = " + price + ", CPU = " + cpu + ", memory = " + memory
                + ", OS = " + os + ", RAM = " + ram;
    }
}
