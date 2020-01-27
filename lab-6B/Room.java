/**
 * @author Tamandeep Singh
 * @version lab6B-1.0
 */
public class Room{
    private double lengthInFeet;
    private double widthInFeet;
    
    /**
     * Room Constructor
     *
     */
    public Room(){
        lengthInFeet = 0.0;
        widthInFeet = 0.0;
    }
    
    /**
     * Room Constructor
     *
     * @param length A parameter
     * @param width A parameter
     */
    public Room(double length, double width){
        setLengthInFeet(length);
        setWidthInFeet(width);
    }
    
    /**
     * Method setLengthInFeet
     *
     * @param length A parameter
     */
    public void setLengthInFeet(double length){
        if(length > 0){
            lengthInFeet = length;
        }
    }
    
    /**
     * Method setWidthInFeet
     *
     * @param width A parameter
     */
    public void setWidthInFeet(double width){
        if(width > 0){
            widthInFeet = width;
        }
    }
    
    /**
     * Method getLengthInFeet
     *
     * @return The return value
     */
    public double getLengthInFeet(){
        return lengthInFeet;
    }
    
    /**
     * Method getWidthInFeet
     *
     * @return The return value
     */
    public double getWidthInFeet(){
        return widthInFeet;
    }
    
    /**
     * Method calculateArea
     *
     * @return The return value
     */
    public double calculateArea(){
        double area;
        area = lengthInFeet * widthInFeet;
        return area;
    }
    
}
