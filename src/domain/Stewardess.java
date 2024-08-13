package domain;

import java.util.Date;

public class Stewardess extends AirplaneCrew{

    String[] personalStrengths;
    Airplane airplane;


    public Stewardess(){}
    public Stewardess(String firstName, String lastName, Date birthDate, Date dateStartedWorking,String[] personalStrengths, Airplane airplane){
        super(firstName, lastName, birthDate, dateStartedWorking);
        this.personalStrengths = personalStrengths;
        this.airplane = airplane;
    }
    public String[] getPersonalStrengths() {
        return personalStrengths;
    }

    public void setPersonalStrengths(String[] personalStrengths) {
        this.personalStrengths = personalStrengths;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
