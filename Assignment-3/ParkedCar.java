/**
 * @author Tamandeep Singh
 * @version 1.0
 */
public class ParkedCar{
    /**
     * Instance variables
     */
    private String ownerName;
    private String carMake;
    private int modelYear;
    private String licensePlateNumber;
    private int numberOfMinutesParked;
    /**
     * static final variables
     */
    public static final int CAR_MODEL_YEAR_LOWER_LIMIT = 1900;
    public static final int CURRENT_YEAR = 2019;
    /**
     * Constructor with arguments 
     * @param owner sets ownerName
     * @param make sets carMake
     * @param modelYear sets modelYearOfCar
     * @param licensePlate sets carLicensePlateNumber
     * @param minutesParked sets numberOfMinutesCarParked
     */
    public ParkedCar(String owner, String make, int inputModelYear, String licensePlate, int minutesParked){
        if(owner != null){
            ownerName = owner;
        }else{
            throw new IllegalArgumentException("owner name cannot be null");
        }
        if(make != null){
            carMake = make;
        }else{
            throw new IllegalArgumentException("car make cannot be null");
        }
        if(licensePlate != null){
            licensePlateNumber = licensePlate;
        }else{
            throw new IllegalArgumentException("car license number cannot be null");
        }
        
        if(inputModelYear >= CAR_MODEL_YEAR_LOWER_LIMIT && inputModelYear <= CURRENT_YEAR ){
            modelYear = inputModelYear;
        }else{
            if(inputModelYear < CAR_MODEL_YEAR_LOWER_LIMIT){
                throw new IllegalArgumentException("model year cannot be earlier than 1900");
            }else{
                throw new IllegalArgumentException("model year cannot be later than 2019");
            }
            
        }
        
        if(minutesParked > 0){
            numberOfMinutesParked = minutesParked;
        }else{
            throw new IllegalArgumentException("minutes parked should be greater than 0");
        }
        
    }
    /**
     * @return ownerName
     */
    public String getOwnerName(){
        return ownerName;
    }
    /**
     * @return carMake
     */
    public String getCarMake(){
        return carMake;
    }
    /**
     * @return carLicensePlateNumber
     */
    public String getLicensePlateNumber(){
        return licensePlateNumber;
    }
    /**
     * @return modelYearOfCar
     */
    public int getModelYear(){
        return modelYear;
    }
    /**
     * @return numberOfMinutesCarParked
     */
    public int getNumberOfMinutesParked(){
        return numberOfMinutesParked;
    }
    /**
     * @param owner sets ownerName 
     */
    public void setOwnerName(String owner){
        if(owner != null){
            ownerName = owner;
        }else{
            throw new IllegalArgumentException("owner name cannot be null");
        }
    }
    /**
     * @param make sets carMake
     */
    public void setCarMake(String make){
        if(make != null){
            carMake = make;
        }else{
            throw new IllegalArgumentException("car make cannot be null");
        }
    }
    /**
     * @param licensePlate sets carLicensePlateNumber
     */
    public void setLicensePlateNumber(String licensePlate){
        if(licensePlate != null){
            licensePlateNumber = licensePlate;
        }else{
            throw new IllegalArgumentException("car license number cannot be null");
        }
    }
    /**
     * @param modelYear sets modelYearOfCar
     */
    public void setModelYear(int inputModelYear){
        if(inputModelYear >= CAR_MODEL_YEAR_LOWER_LIMIT && inputModelYear <= CURRENT_YEAR ){
            modelYear = inputModelYear;
        }else{
            if(inputModelYear < CAR_MODEL_YEAR_LOWER_LIMIT){
                throw new IllegalArgumentException("model year cannot be earlier than 1900");
            }else{
                throw new IllegalArgumentException("model year cannot be later than 2019");
            }
        }
    }
    /**
     * @param minutesParked sets numberOfMinutesCarParked
     */
    public void setNumberOfMinutesParked(int minutesParked){
        if(minutesParked > 0){
            numberOfMinutesParked = minutesParked;
        }else{
            throw new IllegalArgumentException("minutes parked should be greater than 0");
        }
    }
    /**
     * displayDetails prints out the details of car and the owner 
     */
    public void displayDetails(){
        System.out.println("Owner name: " + ownerName);
        System.out.println("Car make: " + carMake);
        System.out.println("Car model year: " + modelYear);
        System.out.println("Car license plate number: " + licensePlateNumber);
        System.out.println("Number of minutes parked: " + numberOfMinutesParked);
    }
    
}
