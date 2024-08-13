package domain;

import java.util.LinkedList;

public class SeatPremium extends Seat{
    private LinkedList<String> extras;
    private int number;

    public SeatPremium(){}

    public SeatPremium(Passenger passenger, boolean isSpecial, LinkedList<String> extras, int number) {
        super(passenger,isSpecial);
        this.extras = extras;
        this.number = number;
    }
    public LinkedList<String> getExtras() {
        return extras;
    }
    public void setExtras(LinkedList<String> extras) {
        this.extras = extras;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
