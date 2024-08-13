package domain;

public class Seat {
    private Passenger passenger;
    private boolean isSpecial;

    public Seat() {}

    public Seat(Passenger passenger, boolean isSpecial) {
        this.passenger = passenger;
        this.isSpecial = isSpecial;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public boolean isSpecial() {
        return isSpecial;
    }
    public void setSpecial(boolean special) {
        isSpecial = special;
    }
}
