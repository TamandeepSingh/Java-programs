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
        // As given in assignment-3 //
        System.out.println("--------------------------As given in assignment-3----------------------------");
        ParkedCar car1 = new ParkedCar("Bob", "Honda", 2004, "IU78Q", 150);
        ParkedCar car3 = new ParkedCar("Rick", "BMW", 2014, "PD72W", 140);
        PoliceOfficer officer1 = new PoliceOfficer("Wayne", "p2398");
        PoliceOfficer officer2 = new PoliceOfficer("Raymond", "p9843");
        officer1.issueParkingTicket(car1, meter);
        officer2.issueParkingTicket(car3, meter);
        PoliceDepartment pd1 = new PoliceDepartment("Vancouver");
        officer2.getTicketList();
        officer2.deleteTicketsByCarLicense("PD72W");
        officer2.getTicketList();
        
    }
}
