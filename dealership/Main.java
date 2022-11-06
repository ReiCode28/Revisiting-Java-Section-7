public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2020, "red");
        Car dodge = new Car("Dodge", 8500, 2019, "blue");
        Car nissan2 = new Car(nissan);

        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

    
        nissan.setPrice(nissan.getPrice() / 2);
        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
         ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
         ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() +
         ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
    }
}
