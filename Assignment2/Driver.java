/**
 * @author Tamandeep Singh
 * @version 1.0
 */
public class Driver{
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        ParkedCar car = new ParkedCar("Taman", "Honda", 2004, "KU78Q", 125);
        car.displayDetails();
        ParkingMeter meter = new ParkingMeter("Vancouver", true, 10, 60);
        meter.displayDetails();
        PoliceOfficer officer = new PoliceOfficer("Patrick", "p1234p");
        officer.issueParkingTicket(car, meter);
        
    }
}
