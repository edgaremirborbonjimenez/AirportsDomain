package presentation;

import airport.City;
import airport.Flight;
import implementation.AirportDAO;
import interfaces.IAirportDAO;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private static IAirportDAO airportDAO;

    public Menu() {
        airportDAO = AirportDAO.getAirportDAOInstance();
    }

    static {
        System.out.println("Welcome to Airport Menu");
    }

    public void displayMenu() {
        System.out.println("What do you want to do?");
        while (true) {
            System.out.println("1. Find a flights to go to somewhere");
            System.out.println("Press 0 to exit");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if (option == 1) {
                selectDestination();
            }if(option == 0){
                break;
            }
        }
    }

    public void selectDestination(){
        System.out.println("Select where you are leaving");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<airportDAO.getCities().size();i++){
            System.out.println((i+1)+".-"+airportDAO.getCities().get(i).getName());
        }
        int optionLeaving = scanner.nextInt();
        if (optionLeaving >airportDAO.getCities().size()) {
            System.out.println("Invalid option");
            selectDestination();
        }else{
            System.out.println("Select destination");
            for(int i = 0;i<airportDAO.getCities().size();i++){
                System.out.println((i+1)+".-"+airportDAO.getCities().get(i).getName());
            }
            int optionGoingTo = scanner.nextInt();
            if (optionGoingTo >airportDAO.getCities().size()) {
                System.out.println("Invalid option");
                selectDestination();
            }else{
                if (optionLeaving == optionGoingTo) {
                    System.out.println("Please select a destination different of the leaving place");
                    selectDestination();
                }else{
                    showRoutes(airportDAO.getRoute(airportDAO.getCities().get(optionLeaving-1),airportDAO.getCities().get(optionGoingTo-1)));
                }
            }
        }
    }
    public void showRoutes(List<List<Flight>> routes){
        for(int i = 0;i<routes.size();i++){
            System.out.println("Route"+ (i+1));
            int cont = routes.get(i).size();
            System.out.println("Flights needed to take");
            for(Flight flight : routes.get(i)){
                System.out.println("Flight #"+cont+" Leave: "+flight.getLeaving().getName() + ", GoingTo: " + flight.getGoingTo().getName()+" -- Price: "+ flight.getPrice());
                cont--;
            }
            System.out.println("Price for the complete route: "+ airportDAO.getRoutePrice(routes.get(i)));
            System.out.println("---------------------------");
        }
    }
}
