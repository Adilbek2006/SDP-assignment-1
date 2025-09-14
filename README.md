Builder Pattern Implementation
Introduction:
In this project I decided to use the Builder Pattern in Java. I chose a Smartphone class as the product.Using a simple constructor with so many parameters is not very convenient, that is why Builder is a good choice.

Implementation:
The main class is Smartphone. All fields are private final, so the object cannot be changed after it is created. Inside the class there is a static nested class Builder. This class has methods for each field (like brand(), model(), cpu(), os(), ram()). Each method returns the builder itself, so we can chain them together.

The build() method creates the final Smartphone object. To print the information I also added toString().

Example of creating a smartphone:

Smartphone iphone = new Smartphone.Builder()
        .brand("Apple")
        .model("iPhone 14 Pro")
        .color("Black")
        .year(2023)
        .price(1200)
        .cpu("A16 Bionic")
        .memory(256)
        .os("iOS")
        .ram("6GB")
        .build();

System.out.println(iphone);

Clean Code
I tried to keep the code clean:
Fields use camelCase and clear names.

Each method does only one thing.

Object is immutable because all fields are final.

Code is easy to read because of method chaining.

Conclusion:
This work shows how Builder Pattern can make object creation easier and cleaner. Instead of writing a long constructor, I can use builder methods step by step. The final code is simple, readable and works correctly.
