public class Airline {
    private Person[] seats;

    public Airline(){
        this.seats = new Person[11];
    }

    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }

    public void setPerson(Person person){
        this.seats[person.getSeatNumber()-1] = new Person(person);
    }

    public void createReservation(Person person){
        while(seats[person.getSeatNumber()-1] != null){
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() 
            + " is already taken. Please choose another seat. \n");
            person.chooseSeat();
        }
        int index = person.getSeatNumber()-1;
        seats[index] = new Person(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java Airlines. Your seat number is " + person.getSeatNumber() + "\n");
    }
}
