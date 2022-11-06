import java.util.Arrays;
 
public class Main {

    public static void main(String[] args) {

        Person person = new Person("Elon Musk", "American", "06/28/1971", 5 ); 
        if (person.applyPassport() == true) {
            person.setPassport();
        
    
        }

       System.out.println(person);
     }
    
  











    // public static void main(String[] args) {
    //     Person person = new Person("Elon Musk", "American", "06/28/1971", 5 );
        

    //     person.chooseSeat();
        
        
    //     System.out.println(person.getName());
    //     System.out.println(person.getNationality());
    //     System.out.println(person.getDateOfBirth());
    //     // System.out.println(Arrays.toString(person.passport));
    //     System.out.println(person.getSeatNumber() + "\n");

    //     if (person.applyPassport() == true){
    //         System.out.println("Congratulations " + person.getName() + ", your passport was approved!");
    //     } else {
    //         System.out.println("We're sorry " + person.getName() + ". We cannot process your application.");
    //     }

    //     // Person person2 = new Person(person);
    //     // person2.setName("Jeff Bezos");
    //     // person2.setSeatNumber(28);
        
    //     // System.out.println(person2.getName());
    //     // System.out.println(person2.getNationality());
    //     // System.out.println(person2.getDateOfBirth());
    //     // System.out.println(Arrays.toString(person2.passport));
    //     // System.out.println(person2.getSeatNumber() + "\n");
 
    // }
  
  
}