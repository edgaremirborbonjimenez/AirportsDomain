package domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Airport {
    LinkedList<Airplane> airplanes;

    public Airport() {
        this.airplanes = new LinkedList<>();
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

    public List<List<Flight>> getRoute(City leaving,City goingTo,int count,int numRec){
        List<List<Flight>> routes = new LinkedList<>();
        List<Flight> routesStops = new LinkedList<>();

//        if(count==0){
//            return new LinkedList<>();
//        }

        for (Airplane airplane : airplanes) {
            if(numRec==0){
                routesStops = new LinkedList<>();
            }
            System.out.println("We are leaving: "+leaving.getName());
            System.out.println("Airplane leaves: "+airplane.getFlight().getLeaving().getName()+"- Arrives: "+airplane.getFlight().getGoingTo().getName()+"\n");

            //if(airplane.getFlight().getLeaving().getName().equalsIgnoreCase(leaving.getName())){
                if(airplane.getFlight().getLeaving().equals(leaving)){

                //if(airplane.getFlight().getGoingTo().getName().equalsIgnoreCase(goingTo.getName())){
                    if(airplane.getFlight().getGoingTo().equals(goingTo)){
                    routesStops.add(airplane.getFlight());
                    routes.add(routesStops);
                    return routes;
                }else{
                    List<List<Flight>> returned = getRoute(airplane.getFlight().getGoingTo(), goingTo,--count,++numRec);
                    numRec--;
                      if(!returned.isEmpty()){
                        for(List<Flight> route : returned){
                            routesStops.addAll(route);
                        routesStops.add(airplane.getFlight());
                        routes.add(routesStops);
                        if(numRec!=0){
                            return routes;
                        }
                        }
                      }else{
                      return routes;
                      }
                }
            }
        }
        return routes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airplanes=" + airplanes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airplanes, airport.airplanes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(airplanes);
    }
}
