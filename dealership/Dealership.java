import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership(){
        this.cars = new Car[3];
    }

    //Updates one object at a time and lets the user choose which one.
    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index){
        return new Car(this.cars[index]);
    }
    
    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;
    }
}
