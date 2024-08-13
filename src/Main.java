import domain.*;

import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        AirplaneCrew pilot1 = new Pilot();
        pilot1.setBirthDate(new Date());
        pilot1.setFirstName("James");
        pilot1.setLastName("Doe");
        pilot1.setAmountOfTripsDone(10);
        pilot1.setDateStartedWorking(new Date());

        AirplaneCrew pilot2 = new Pilot();
        pilot2.setBirthDate(new Date());
        pilot2.setFirstName("Bob");
        pilot2.setLastName("Smith");
        pilot2.setAmountOfTripsDone(20);
        pilot2.setDateStartedWorking(new Date());

        AirplaneCrew stewardess1 = new Stewardess();
        stewardess1.setDateStartedWorking(new Date());
        stewardess1.setAmountOfTripsDone(15);
        stewardess1.setFirstName("Jeniffer");
        stewardess1.setLastName("Smith");
        stewardess1.setBirthDate(new Date());

        AirplaneCrew stewardess2 = new Stewardess();
        stewardess2.setDateStartedWorking(new Date());
        stewardess2.setAmountOfTripsDone(5);
        stewardess2.setFirstName("Laura");
        stewardess2.setLastName("Rodriguez");
        stewardess2.setBirthDate(new Date());

        AirplaneCrew stewardess3 = new Stewardess();
        stewardess3.setDateStartedWorking(new Date());
        stewardess3.setAmountOfTripsDone(3);
        stewardess3.setFirstName("Luisa");
        stewardess3.setLastName("Doe");
        stewardess3.setBirthDate(new Date());

        Passenger passenger1 = new Passenger();
        passenger1.setNationality("Mexico");
        passenger1.setFirstName("James");
        passenger1.setLastName("Doe");
        passenger1.setBirthDate(new Date());
        passenger1.setPassportCode("ALSJGPSOEJDLS");

        Passenger passenger2 = new Passenger();
        passenger2.setNationality("Mexico");
        passenger2.setFirstName("Jaden");
        passenger2.setLastName("Smith");
        passenger2.setBirthDate(new Date());
        passenger2.setPassportCode("GFHDGSFFDFGD");

        Airplane airplane = new Airplane();
        airplane.setId("LKJ-SDF");
        airplane.setOrigin("Los Angeles");
        airplane.setDestination("Mexico City");

        for(int i=0;i<5;i++){
            airplane.addSeatGeneral(new SeatGeneral(null,false,i+1,"NA"));
            airplane.addSeatPremium(new SeatPremium(null,false,new LinkedList<>(),i+1));
        }

        airplane.asignSeatToPassenger(passenger1,1,1);
        airplane.asignSeatToPassenger(passenger2,1,0);

        Airport airport = new Airport();
        airport.setName("Airport LAX");
        airport.setAddress("1 World Way, Los Angeles, CA 90045");
        airport.addAirplane(airplane);
        }
    }
