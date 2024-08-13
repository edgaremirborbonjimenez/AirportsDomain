package domain;

import java.util.Date;

public class AirplaneCrew extends Person{
    private Date dateStartedWorking;
    private int amountOfTripsDone;

    public AirplaneCrew(){}

    public AirplaneCrew(String firstName, String lastName, Date birthDate, Date dateStartedWorking) {
        super(firstName,lastName,birthDate);
        this.dateStartedWorking = dateStartedWorking;
        this.amountOfTripsDone = 0;
    }

    public Date getDateStartedWorking() {
        return dateStartedWorking;
    }
    public void setDateStartedWorking(Date dateStartedWorking) {
        this.dateStartedWorking = dateStartedWorking;
    }
    public int getAmountOfTripsDone() {
        return amountOfTripsDone;
    }

    public void setAmountOfTripsDone(int amountOfTripsDone) {
        this.amountOfTripsDone = amountOfTripsDone;
    }

    public void addOneMoreTrip(){
        this.amountOfTripsDone++;
    }
}
