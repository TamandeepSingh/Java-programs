/**
 * @author Tamandeep Singh
 * @version 1.0
 */
public class ParkingMeter{
    /**
     * Instance variables 
     */
    private String meterLocation;
    private boolean hasACamera;
    private double priceOfOneMinuteInCAD;
    private int numberOfPurchasedMinutes;
    /**
     * static final variables
     */
    public static final int NUMBER_OF_PURCHASED_MINUTES_LIMIT = 180;
    /**
     * Constructor with arguments
     * @param inputMeterLocation sets meterLocation
     * @param haveCamera sets hasACamera
     * @param inputPriceOfOneMinute sets priceOfOneMinuteInCAD
     * @param inputPurchasedMinutes sets numberOfPurchasedMinutes
     */
    public ParkingMeter(String inputMeterLocation, boolean haveCamera, double inputPriceOfOneMinute, int inputPurchasedMinutes){
        if(inputMeterLocation != null){
            meterLocation = inputMeterLocation;
        }else{
            throw new IllegalArgumentException("meter location cannot be null");
        }
        if(inputPriceOfOneMinute > 0){
            priceOfOneMinuteInCAD = inputPriceOfOneMinute;
        }else{
            throw new IllegalArgumentException("price of one minute cannot be 0 or less");
        }
        
        if(inputPurchasedMinutes > 0 && inputPurchasedMinutes <= NUMBER_OF_PURCHASED_MINUTES_LIMIT){
            numberOfPurchasedMinutes = inputPurchasedMinutes;
        }else if(inputPurchasedMinutes > NUMBER_OF_PURCHASED_MINUTES_LIMIT){
            System.out.println("number of purchased minutes cannot be greater than 180, the value will set to 180");
            numberOfPurchasedMinutes = NUMBER_OF_PURCHASED_MINUTES_LIMIT;
        }else{
            throw new IllegalArgumentException("number of purchased minutes cannot be 0 or negative");
        }
        
        hasACamera = haveCamera;
    }
    /**
     * @return meterLocation
     */
    public String getMeterLocation(){
        return meterLocation;
    }
    /**
     * @return hasACamera
     */
    public boolean getHasACamera(){
        return hasACamera;
    }
    /**
     * @return priceOfOneMinuteInCAD
     */
    public double getPriceOfOneMinuteInCAD(){
        return priceOfOneMinuteInCAD;
    }
    /**
     * @return numberOfPurchasedMinutes
     */
    public int getNumberOfPurchasedMinutes(){
        return numberOfPurchasedMinutes;
    }
    /**
     * @param inputMeterLocation sets meterLocation
     */
    public void setMeterLocation(String inputMeterLocation){
        if(inputMeterLocation != null){
            meterLocation = inputMeterLocation;
        }else{
            throw new IllegalArgumentException("meter location cannot be null");
        }
    }
    /**
     * @param haveCamera sets hasACamera
     */
    public void setHasACamera(boolean haveCamera){
        hasACamera = haveCamera;
    }
    /**
     * @param inputPriceOfOneMinute sets priceOfOneMinuteInCAD
     */
    public void setPriceOfOneMinuteInCAD(double inputPriceOfOneMinute){
        if(inputPriceOfOneMinute > 0){
            priceOfOneMinuteInCAD = inputPriceOfOneMinute;
        }else{
            throw new IllegalArgumentException("price of one minute cannot be 0 or less");
        }
    }
    /**
     * @param inputPurchasedMinutes sets numberOfPurchasedMinutes
     */
    public void setNumberOfPurchasedMinutes(int inputPurchasedMinutes){
        if(inputPurchasedMinutes > 0 && inputPurchasedMinutes <= NUMBER_OF_PURCHASED_MINUTES_LIMIT){
            numberOfPurchasedMinutes = inputPurchasedMinutes;
        }else if(inputPurchasedMinutes > NUMBER_OF_PURCHASED_MINUTES_LIMIT){
            System.out.println("number of purchased minutes cannot be greater than 180, the value will set to 180");
            numberOfPurchasedMinutes = NUMBER_OF_PURCHASED_MINUTES_LIMIT;
        }else{
            throw new IllegalArgumentException("number of purchased minutes cannot be greater than 180, the value will set to 180");
        }
    }
    /**
     * displayDetails prints out the details of meter
     */
    public void displayDetails(){
        System.out.println("metre location: " + meterLocation);
        System.out.println("meter have a camera: " + hasACamera);
        System.out.println("price of one minute in CAD: " + priceOfOneMinuteInCAD);
        System.out.println("number of purchased minutes: " + numberOfPurchasedMinutes);
    }
    
}
