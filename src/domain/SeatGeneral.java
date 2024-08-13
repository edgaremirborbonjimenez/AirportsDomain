package domain;

public class SeatGeneral extends Seat{
    private int number;
    private String details;


    public SeatGeneral(Passenger passenger, boolean isSpecial,int number, String details) {
        super(passenger, isSpecial);
        this.number = number;
        this.details = details;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDetails() {
        return details;
    }
}
