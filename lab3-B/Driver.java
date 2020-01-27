/**
 * @author Tamandeep Singh
 * @version lab-3-B-1.0
 */
public class Driver{
    //Instance variables
    private String nameOfDriver;
    private String driverLicenseNumber;
    private double speedInKilometerPerHour;
    private String driverStanding;
    /**
     * @param name sets name of driver
     * @param licenseNumber driver license number
     * @param speed sets speed in kilometer per hour
     */
    public Driver(String name, String licenseNumber, double speed){
        if(name != null){
            nameOfDriver = name;
        }else{
            throw new IllegalArgumentException("Driver's name cannot be null");
        }
        if(licenseNumber != null){
            driverLicenseNumber = licenseNumber;
        }else{
            throw new IllegalArgumentException("Driver's license number cannot be null");
        }
        
        if(speed > 0){
            speedInKilometerPerHour = speed;
        }else{
            throw new IllegalArgumentException("Speed cannot be zero or negative");
        }
        
        driverStanding = "unknown";
    }
    /**
     * @return nameOfDriver
     */
    public String getNameOfDriver(){
        return nameOfDriver;
    }
    /**
     * @return driverLicenseNumber
     */
    public String getDriverLicenseNumber(){
        return driverLicenseNumber;
    }
    /**
     * @return speedInKilometerPerHour
     */
    public double getSpeedInKilometerPerHour(){
        return speedInKilometerPerHour;
    }
    /**
     * @return driverStanding
     */
    public String getDriverStanding(){
        return driverStanding;
    }
    /**
     * @param name sets nameOfDriver
     */
    public void setNameOfDriver(String name){
        if(name != null){
            nameOfDriver = name;
        }else{
            throw new IllegalArgumentException("Driver's name cannot be null");
        }
    }
    /**
     * @param driverLicense sets driverLicenseNumber
     */
    public void setDriverLicenseNumber(String driverLicense){
        if(driverLicense != null){
            driverLicenseNumber = driverLicense;
        }else{
            throw new IllegalArgumentException("Driver's license number cannot be null");
        }
    }
    /**
     * @param speed speedInKilometerPerHour
     */
    public void setSpeedInKilometerPerHour(double speed){
        if(speed > 0){
            speedInKilometerPerHour = speed;
        }else{
            throw new IllegalArgumentException("Speed cannot be zero or negative");
        }
    }
    /**
     * no args
     */
    public void setDriverStanding(){
        if(speedInKilometerPerHour <= 60){
            driverStanding = "No Ticket";
        }
        else if(speedInKilometerPerHour <= 80){
            driverStanding = "Small Ticket";
        }
        else if(speedInKilometerPerHour > 80){
            driverStanding = "Big Ticket";
        }
    }
    /*
     * driverDetails method gives out the driver's details
     */
    public void driverDetails(){
        System.out.println("Driver's name : " + nameOfDriver);
        System.out.println("Driver's License number : " + driverLicenseNumber);
        System.out.println("Speed : " + speedInKilometerPerHour + " km/hr");
        System.out.println("Driver Standing : " + driverStanding);
    }
    
}
