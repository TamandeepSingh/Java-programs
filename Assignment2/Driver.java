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
        ParkedCar car = new ParkedCar("Taman", "Honda", 2002, "Va332", 125);
        car.displayDetails();
        ParkingMeter meter = new ParkingMeter("Vancouver", true, 10, 60);
        meter.displayDetails();
        PoliceOfficer officer = new PoliceOfficer("Patrick", "vaee4");
        officer.issueParkingTicket(car, meter);
        
    }
}
