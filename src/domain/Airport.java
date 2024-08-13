package domain;

import java.util.LinkedList;

public class Airport {
    String name;
    String address;
    LinkedList<Airplane> airplanes;

    public Airport() {
        this.airplanes = new LinkedList<>();
    }
    public Airport(String name, String address, LinkedList<Airplane> airplanes) {
        this.name = name;
        this.address = address;
        this.airplanes = airplanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LinkedList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(LinkedList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    public Airplane getAirplaneById(String id) {
        for (Airplane airplane : airplanes) {
            if (airplane.getId().equals(id)) {
                return airplane;
            }
        }
        return null;
    }
}
