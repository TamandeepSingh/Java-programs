/**
 * @author Tamandeep Singh
 * @version lab-7A
 */
public class FuelGuage{
    private static final int FUEL_TANK_LIMIT = 15;
    private int amoutOfFuelInLitres;
    
    /**
     * FuelGuage Constructor
     *
     */
    public FuelGuage(){
        amoutOfFuelInLitres = 0;
    }
    
    /**
     * FuelGuage Constructor
     *
     * @param inputAmountOfFuel A parameter
     */
    public FuelGuage(int inputAmountOfFuel){
        setAmoutOfFuelInLitres(inputAmountOfFuel);
    }
    
    /**
     * Method setAmoutOfFuelInLitres
     *
     * @param inputAmountOfFuel A parameter
     */
    public void setAmoutOfFuelInLitres(int inputAmountOfFuel){
        if(inputAmountOfFuel >= 0 && inputAmountOfFuel <= FUEL_TANK_LIMIT){
            amoutOfFuelInLitres = inputAmountOfFuel;
        }else{
            throw new IllegalArgumentException("Amount of Fuel should be between 0 to 15");
        }
    }
    
    /**
     * Method getAmoutOfFuelInLitres
     *
     * @return The return value
     */
    public int getAmoutOfFuelInLitres(){
        return amoutOfFuelInLitres;
    }

    /**
     * Method useFuel
     *
     */
    public void useFuel(){
        if(amoutOfFuelInLitres != 0){
            amoutOfFuelInLitres = amoutOfFuelInLitres -1;
        }else{
            System.out.println("the tank is empty the fuel cannot go below 0");
        }
        
    }
    
    /**
     * Method addFuel
     *
     */
    public void addFuel(){
        if(amoutOfFuelInLitres < FUEL_TANK_LIMIT){
            amoutOfFuelInLitres = amoutOfFuelInLitres + 1;
        }else{
            System.out.println("tank is full");
        }
        
    }
    
}
