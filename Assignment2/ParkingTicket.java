/**
 * @author Tamandeep Singh
 * @version 1.0
 */
public class ParkingTicket{
    private String ticketNumber;
    private String officerName;
    private String officerBadgeNumber;
    private String carLicensePlateNumber;
    private double fineAmountInCAD;
    public static int counter = 1000;
    public static final String TICKET_PREFIX = "VAN";
    
    /**
     * ParkingTicket Constructor
     *
     * @param inputOfficerName A parameter
     * @param inputOfficerBadgeNumber A parameter
     * @param carLicenseNumber A parameter
     * @param fine A parameter
     */
    public ParkingTicket(String inputOfficerName, String inputOfficerBadgeNumber, String carLicenseNumber, double fine){
        generatTicketNumber();
        setOfficerName(inputOfficerName);
        setOfficerBadgeNumber(inputOfficerBadgeNumber);
        setCarLicensePlateNumber(carLicenseNumber);
        setFineAmountInCAD(fine);
        
    }
    
    /**
     * Method setPoliceOfficerName
     *
     * @param inputOfficerName A parameter
     */
    public void setOfficerName(String inputOfficerName){
        if(inputOfficerName == null){
            throw new IllegalArgumentException("officer name must not be null");
        }else{
            if(inputOfficerName.isEmpty()){
                throw new IllegalArgumentException("officer name must not be an empty String");
            }else{
                officerName = inputOfficerName;
            }
        }
        
    }
    
    /**
     * Method setPoliceOfficerBadgeNumber
     *
     * @param inputOfficerBadgeNumber A parameter
     */
    public void setOfficerBadgeNumber(String inputOfficerBadgeNumber){
        if(inputOfficerBadgeNumber == null){
            throw new IllegalArgumentException("badge number must not be null");
        }else{
            if(inputOfficerBadgeNumber.isEmpty()){
                throw new IllegalArgumentException("badge number must not be empty String");
            }else{
                officerBadgeNumber = inputOfficerBadgeNumber;
            }
        }
        
    }
    
    /**
     * Method setLicensePlateNumber
     *
     * @param carLicenseNumber A parameter
     */
    public void setCarLicensePlateNumber(String carLicenseNumber){
        if(carLicenseNumber == null){
            throw new IllegalArgumentException("car license plate number must not be null");
        }else{
            if(carLicenseNumber.isEmpty()){
                throw new IllegalArgumentException("car license plate number must not be empty String");
            }else{
                carLicensePlateNumber = carLicenseNumber;
            }
        }
    }
    
    /**
     * Method setAmountOfFine
     *
     * @param fine A parameter
     */
    public void setFineAmountInCAD(double fine){
        if(fine > 0){
            fineAmountInCAD = fine;
        }else if(fine == 0){
            throw new IllegalArgumentException("fine amount must not be 0");
        }else{
            throw new IllegalArgumentException("fine amount must not be negative");
        }
    }
    
    /**
     * Method resetCounter
     *
     */
    public static void resetCounter(){
        counter =1000;
    }
    
    /**
     * Method setTicketNumer
     *
     */
    private void generatTicketNumber(){
        counter++;
        ticketNumber = TICKET_PREFIX + counter;
    }
    
    /**
     * Method getPoliceOfficerName
     *
     * @return The return value
     */
    public String getOfficerName(){
        return officerName;
    }
    
    /**
     * Method getPoliceOfficerBadgeNumber
     *
     * @return The return value
     */
    public String getOfficerBadgeNumber(){
        return officerBadgeNumber;
    }
    
    /**
     * Method getLicensePlateNumber
     *
     * @return The return value
     */
    public String getCarLicensePlateNumber(){
        return carLicensePlateNumber;
    }
    
    /**
     * Method getAmountOfFine
     *
     * @return The return value
     */
    public double getFineAmountInCAD(){
        return fineAmountInCAD;
    }
    
    /**
     * Method getTicketNumer
     *
     * @return The return value
     */
    public String getTicketNumber(){
        return ticketNumber;
    }
    
    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Officer Name: " + getOfficerName());
        System.out.println("Officer Badge number: "+ getOfficerBadgeNumber());
        System.out.println("Car License Plate Number: "+ getCarLicensePlateNumber());
        System.out.println("Fine amount: "+ getFineAmountInCAD());
    }
    
}
