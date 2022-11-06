public class Person {
    
    public String name;
    public String nationality;
    public String dateOfBirth;
    public String[] passport;
    public int seatNumber;

    public Person (String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public Person (Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;

    }

    public String getName(){
        return this.name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
 
}
