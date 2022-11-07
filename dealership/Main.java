import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "Jet Black", new String[] {"tires", "filter"}),
            
        };

        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        dealership.sell(2);
    
        // nissan.setPrice(nissan.getPrice() / 2);
        // dodge.setPrice(dodge.getPrice() / 2);

        // System.out.println(Arrays.toString(nissan2.getParts()));
        
        
        // nissan.drive();
        // dodge.drive();
        // nissan2.drive();
        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
        //  ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
        //  ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        // System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() +
        //  ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
    }
}
