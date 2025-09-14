public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone.Builder().brand("apple").model("iphone").color("black").year(2024).price(2500001).cpu("apple A18").memory(256).os("IOS").ram("8 GB").build();
        System.out.println(iphone);

    }
}