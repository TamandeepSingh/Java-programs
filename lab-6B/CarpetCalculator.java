/**
 * @author Tamandeep Singh
 * @version lab6B-1.0
 */
public class CarpetCalculator{
    private double pricePerSquareFoot;
    private Room room;
    
    /**
     * CarpetCalculator Constructor
     *
     * @param priceOfCarpet A parameter
     * @param inputRoom A parameter
     */
    public CarpetCalculator(double priceOfCarpet, Room inputRoom){
        setPricePerSquareFoot(priceOfCarpet);
        setRoom(inputRoom);
    }
    
    /**
     * Method getPricePerSquareFoot
     *
     * @return The return value
     */
    public double getPricePerSquareFoot(){
        return pricePerSquareFoot;
    }
    
    /**
     * Method getRoom
     *
     * @return The return value
     */
    public Room getRoom(){
        return room;
    }
    
    /**
     * Method setPricePerSquareFoot
     *
     * @param priceOfCarpet A parameter
     */
    public void setPricePerSquareFoot(double priceOfCarpet){
        if(priceOfCarpet > 0){
            pricePerSquareFoot = priceOfCarpet;
        }
    }
    
    /**
     * Method getRoom
     *
     * @param inputRoom A parameter
     */
    public void setRoom(Room inputRoom){
        if(inputRoom != null){
            room = inputRoom;
        }else{
            room = new Room();
        }
    }
    
    /**
     * Method calculateTotalCost
     *
     * @return The return value
     */
    public double calculateTotalCost(){
        double result;
        result = getPricePerSquareFoot() * room.calculateArea();
        return result;
    }
    
    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        
        System.out.println("Width of the room :" + room.getWidthInFeet());
        System.out.println("Length of the room :" + room.getLengthInFeet());
        System.out.println("Price of carpet per square :" + getPricePerSquareFoot());
        System.out.println("Total cost of the carpet :" + calculateTotalCost());
        
    }
    
}
