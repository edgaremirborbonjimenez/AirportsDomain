package domain;

import java.util.LinkedList;
import java.util.List;

public class Airplane {
    private String id;
    private String origin;
    private String destination;
    private LinkedList<Passenger> passengers;
    private LinkedList<Pilot> pilots;
    private LinkedList<Stewardess> stewards;
    private LinkedList<SeatGeneral> seatGenerals;
    private LinkedList<SeatPremium> seatPremiums;

    public Airplane() {
        this.passengers = new LinkedList<>();
        this.pilots = new LinkedList<>();
        this.stewards = new LinkedList<>();
        this.seatGenerals = new LinkedList<>();
        this.seatPremiums = new LinkedList<>();
    }

    public Airplane(String id, String origin, String destination) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public List<Passenger> getPassengers() {
        return passengers;
    }
    public void asignSeatToPassenger(Passenger passenger,int numSeat,int type) {
        this.passengers.add(passenger);
        if (type == 1) {
            this.seatGenerals.get(numSeat).setPassenger(passenger);
        }else{
            this.seatPremiums.get(numSeat).setPassenger(passenger);
        }
    }

    public void removeFromSeat(int passengerIndex,int numSeat,int type){
        this.passengers.remove(passengerIndex);
        if (type == 1) {
            this.seatGenerals.remove(numSeat);
        }else{
            this.seatPremiums.remove(numSeat);
        }
    }
    public List<Pilot> getPilots() {
        return pilots;
    }
    public void asignPilot(Pilot pilot){
        this.pilots.add(pilot);
    }
    public List<Stewardess> getStewardess() {
        return stewards;
    }
    public void asignStewardess(Stewardess steward){
        this.stewards.add(steward);
    }
    public List<SeatGeneral> getSeatGenerals() {
        return seatGenerals;
    }
    public List<SeatPremium> getSeatPremiums() {
        return seatPremiums;
    }

    public void addSeatGeneral(SeatGeneral seatGeneral){
        this.seatGenerals.add(seatGeneral);
    }
    public void addSeatPremium(SeatPremium seatPremium){
        this.seatPremiums.add(seatPremium);
    }

}
