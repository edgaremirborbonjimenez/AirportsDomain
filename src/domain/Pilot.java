package domain;

import java.util.Date;

public class Pilot extends AirplaneCrew{

    String range;
    Airplane airplane;

    public Pilot() {}

    public Pilot(String firstName, String lastName, Date birthDate, Date dateStartedWorking, String range, Airplane airplane) {
        super(firstName, lastName, birthDate, dateStartedWorking);
        this.range = range;
        this.airplane = airplane;
    }

    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }
    public Airplane getAirplane() {
         return airplane;
    }
    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
