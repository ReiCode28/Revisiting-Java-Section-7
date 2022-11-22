import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "Jet Black", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "Orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "Jet Black", new String[] {"tires", "filter", "transmission"}),
            
        };

        Dealership dealership = new Dealership(cars);
        System.out.println(dealership);

        // for (int i = 0; i < cars.length; i++) {
        //     dealership.setCar(cars[i], i);
        // }
    }
}