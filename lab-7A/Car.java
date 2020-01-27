/**
 * @author Tamandeep Singh
 * @version lab-7A
 */
public class Car{
    private String carMake;
    private String carColour;
    private FuelGuage fuelGuage;
    
    /**
     * Car Constructor
     *
     */
    public Car(){
        carMake = "unknown";
        carColour = "unknown";
        fuelGuage = new FuelGuage();
    }
    
    /**
     * Car Constructor
     *
     * @param inputMake A parameter
     * @param inputColour A parameter
     * @param fuelAmount A parameter
     */
    public Car(String inputMake, String inputColour, int fuelAmount){
        setCarMake(inputMake);
        setCarColour(inputColour);
        setFuelGuage(new FuelGuage(fuelAmount));
    }
    
    /**
     * Method setCarMake
     *
     * @param inputMake A parameter
     */
    public void setCarMake(String inputMake){
        if(inputMake != null){
            carMake = inputMake;
        }else{
            throw new IllegalArgumentException("Car make cannot be null");
        }
    }
    
    /**
     * Method setCarColour
     *
     * @param inputColour A parameter
     */
    public void setCarColour(String inputColour){
        if(inputColour != null){
            carColour = inputColour;
        }else{
            throw new IllegalArgumentException("Car colour cannot be null");
        }
    }
    
    /**
     * Method setFuelGuage
     *
     * @param inputFuelGuage A parameter
     */
    public void setFuelGuage(FuelGuage inputFuelGuage){
        if(inputFuelGuage != null){
            fuelGuage = inputFuelGuage;
        }else{
            throw new IllegalArgumentException("object cannot be null");
        }
    }
    
    /**
     * Method getCarColour
     *
     * @return The return value
     */
    public String getCarColour(){
        return carColour;
    }
    
    /**
     * Method getCarMake
     *
     * @return The return value
     */
    public String getCarMake(){
        return carMake;
    }
    
    /**
     * Method getFuelGuage
     *
     * @return The return value
     */
    public FuelGuage getFuelGuage(){
        return fuelGuage;
    }
    
    /**
     * Method drive
     *
     */
    public void drive(){
        fuelGuage.useFuel();
    }
    
    /**
     * Method fillTank
     *
     */
    public void fillTank(){
        fuelGuage.addFuel();
    }
    
}
