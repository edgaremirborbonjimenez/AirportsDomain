package interfaces;

import airport.Airplane;
import airport.City;
import airport.Flight;

import java.util.List;

public interface IAirportDAO {

    public List<List<Flight>> getRoute(City leaving, City goingTo);
    public Airplane addAirplane(Airplane airplane);
    public double getRoutePrice(List<Flight> flights);
    public List<City> getCities();

}
