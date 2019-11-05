/**
 * @author Tamandeep Singh
 * @version 1.0
 */
public class PoliceOfficer{
    private String officerName;
    private String officerBadgeNumber;
    public static final int ONE_HOUR_FINE_AMOUNT = 20;
    public static final int MINUTES_IN_HOUR = 60;

    /**
     * PoliceOfficer Constructor
     *
     * @param name A parameter
     * @param badgeNumber A parameter
     */
    public PoliceOfficer(String name, String badgeNumber){
        setOfficerName(name);
        setOfficerBadgeNumber(badgeNumber);
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
    public ParkingTicket issueParkingTicket(ParkedCar car, ParkingMeter meter){
        ParkingTicket ticket;
        if(car.getNumberOfMinutesParked() > meter.getNumberOfPurchasedMinutes()){
            ticket = new ParkingTicket(getOfficerName(), getOfficerBadgeNumber(), car.getLicensePlateNumber(), calculateFine(car, meter));
            ticket.displayDetails();
        }else{
            ticket = null;
        }
        return ticket;
    }

}
