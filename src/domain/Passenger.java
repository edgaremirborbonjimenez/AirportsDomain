package domain;

import java.util.Date;

public class Passenger extends Person{

    private String nationality;
    private String passportCode;

    public Passenger(){}

    public Passenger(String firstName, String lastName, Date birthDate, String nationality, String passportCode) {
        super(firstName,lastName,birthDate);
        this.nationality = nationality;
        this.passportCode = passportCode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }
}


