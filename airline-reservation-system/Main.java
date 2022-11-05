import java.util.Arrays;
 
public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Elon Musk", "American", "06/28/1971", 5 );

        person.setSeatNumber(10);
        
        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getDateOfBirth());
        // System.out.println(Arrays.toString(person.passport));
        System.out.println(person.getSeatNumber());
 
    }
  
  
}