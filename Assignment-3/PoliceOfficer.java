/**
 * @author Tamandeep Singh
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Iterator;
public class PoliceOfficer{
    private String officerName;
    private String officerBadgeNumber;
    public static final int ONE_HOUR_FINE_AMOUNT = 20;
    public static final int MINUTES_IN_HOUR = 60;
    private ArrayList<ParkingTicket> ticketList;
//    private ParkingTicket[] ticketArrayByLicenseNumber;

    /**
     * PoliceOfficer Constructor
     *
     * @param name A parameter
     * @param badgeNumber A parameter
     */
    public PoliceOfficer(String name, String badgeNumber){
        ticketList = new ArrayList<ParkingTicket>();
        setOfficerName(name);
        setOfficerBadgeNumber(badgeNumber);
        
    }
    
    /**
     * Method getTicketList
     *
     * @return The return value
     */
    public ArrayList<ParkingTicket> getTicketList(){
        return ticketList;
    }
    
    /**
     * Method setOfficerName
     *
     * @param name A parameter
     */
    public void setOfficerName(String name){
        if(name == null){
            throw new IllegalArgumentException("officer name must not be null");
        }else{
            if(name.isEmpty()){
                throw new IllegalArgumentException("officer name must not be an empty String");
            }else{
                officerName = name;
            }
        }
    }
    
    /**
     * Method setOfficerBadgeNumber
     *
     * @param badgeNumber A parameter
     */
    public void setOfficerBadgeNumber(String badgeNumber){
        if(badgeNumber == null){
            throw new IllegalArgumentException("badge number must not be null");
        }else{
            if(badgeNumber.isEmpty()){
                throw new IllegalArgumentException("badge number must not be empty String");
            }else{
                officerBadgeNumber = badgeNumber;
            }
        }
    }
    
    /**
     * Method getOfficerName
     *
     * @return The return value
     */
    public String getOfficerName(){
        return officerName;
    }
    
    /**
     * Method getOfficerBadgeNumber
     *
     * @return The return value
     */
    public String getOfficerBadgeNumber(){
        return officerBadgeNumber;
    }
    
    /**
     * Method isParkingTimeExpired
     *
     * @param car A parameter
     * @param meter A parameter
     * @return The return value
     */
    private boolean isParkingTimeExpired(ParkedCar car, ParkingMeter meter){

        if(car.getNumberOfMinutesParked() > meter.getNumberOfPurchasedMinutes()){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Method calculateFine
     *
     * @param car A parameter
     * @param meter A parameter
     * @return The return value
     */
    private double calculateFine(ParkedCar car, ParkingMeter meter){
        int hour;
        int remain;
        double fine = 0;
        if(isParkingTimeExpired(car,meter)){
            hour = (car.getNumberOfMinutesParked() - meter.getNumberOfPurchasedMinutes()) / MINUTES_IN_HOUR;
            remain = (car.getNumberOfMinutesParked() - meter.getNumberOfPurchasedMinutes()) % MINUTES_IN_HOUR;
            
            if(remain ==0){
                fine = hour * ONE_HOUR_FINE_AMOUNT;
            }else if(remain > 0){
                fine = (hour + 1) * ONE_HOUR_FINE_AMOUNT;
            }
            
        }
        return fine;
    }
    
    /**
     * Method issueParkingTicket
     *
     * @param car A parameter
     * @param meter A parameter
     * @return The return value
     */
    public void issueParkingTicket(ParkedCar car, ParkingMeter meter){
        ParkingTicket ticket;
        if(car.getNumberOfMinutesParked() > meter.getNumberOfPurchasedMinutes()){
            ticket = new ParkingTicket(getOfficerName(), getOfficerBadgeNumber(), car.getLicensePlateNumber(), calculateFine(car, meter));
            ticket.displayDetails();
            ticketList.add(ticket);
        }else{
            ticket = null;
        }
    }
    
    /**
     * Method sumAllfines
     *
     * @return The return value
     */
    public double sumAllfines(){
        double sumOfFine = 0;
        for( ParkingTicket ticket : ticketList ){
            double fine = ticket.getFineAmountInCAD();
            sumOfFine = sumOfFine + fine;
        }
        return sumOfFine;
    }
    
    /**
     * Method getParkingTicketsCountForACar
     *
     * @param inputLicensePlateNumber A parameter
     * @return The return value
     */
    public int getParkingTicketsCountForACar(String inputLicensePlateNumber){
        int count = 0;
        if(inputLicensePlateNumber != null){
            for( ParkingTicket ticket : ticketList ){
                if(ticket.getCarLicensePlateNumber().equalsIgnoreCase(inputLicensePlateNumber) ){
                    count = count +1;
                }
            }
        }else{
            System.out.println("License plate number cannot be null");
        }
        return count;
    }
    
    /**
     * Method getTicketArrayByLicenseNumber
     *
     * @param inputLicensePlateNumber A parameter
     * @return The return value
     */
    public ParkingTicket[] getTicketArrayByLicenseNumber(String inputLicensePlateNumber){
        ParkingTicket[] ticketArrayByLicenseNumber = new ParkingTicket[getParkingTicketsCountForACar(inputLicensePlateNumber)];
        if(inputLicensePlateNumber != null){
            for(int row = 0; row < ticketArrayByLicenseNumber.length ; row++){
                for( ParkingTicket ticket : ticketList ){
                    if(ticket.getCarLicensePlateNumber().equalsIgnoreCase(inputLicensePlateNumber) ){
                        ticketArrayByLicenseNumber[row] = ticket;
                    }
                }
            }
        }else{
            System.out.println("License plate number cannot be null");
        }
        return ticketArrayByLicenseNumber;
    }
    
    /**
     * Method getSumOfFinesByCar
     *
     * @param inputLicensePlateNumber A parameter
     * @return The return value
     */
    public double getSumOfFinesByCar(String inputLicensePlateNumber){
        int count = 0;
        double totalFine = 0;
        if(inputLicensePlateNumber != null){            
            for( ParkingTicket ticket : ticketList ){
                if(ticket.getCarLicensePlateNumber().equalsIgnoreCase(inputLicensePlateNumber) ){
                    totalFine = totalFine + ticket.getFineAmountInCAD();
                }
            }
        }else{
            System.out.println("License plate number cannot be null");
        }
        return totalFine;
    }
    
    /**
     * Method displayticketsDetails
     *
     */
    public void displayticketsDetails(){
        for( ParkingTicket ticket : ticketList ){
            ticket.displayDetails();
            System.out.println();
        }
    }
    
    /**
     * Method deleteTicketsByCarLicense
     *
     * @param inputLicensePlateNumber A parameter
     * @return The return value
     */
    public int deleteTicketsByCarLicense(String inputLicensePlateNumber){
        int count = 0;
        if(inputLicensePlateNumber != null){
            Iterator<ParkingTicket> iter = ticketList.iterator();
            while(iter.hasNext()){
                ParkingTicket ticket = iter.next();
                if(ticket.getCarLicensePlateNumber().equalsIgnoreCase(inputLicensePlateNumber) ){
                    iter.remove();
                    count = count +1;
                }
            }
            
        }else{
            System.out.println("License plate number cannot be null");
        }
        return count;
    }

}
