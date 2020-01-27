/**
 * Program for RetailItems
 * @author Tamandeep Singh
 * @version 1.0
 */
public class RetailItem{
    // Instance variables
    private String itemDescription;
    private double itemPriceInCAD;
    private boolean isInDemand;
    private int numberOfUnitsInStock;
    
    //Constructors
    /**
     * Constuctor with no args
     */
    public RetailItem(){
        itemDescription = "unknown";
        itemPriceInCAD = 1.0;
        isInDemand = false;
        numberOfUnitsInStock = 1;
    }
    /**
     * Constructor with arguments
     * @param inputItemDesc sets itemDescription
     * @param ipnutItemPrice sets itemPriceInCAD
     * @param inputInDemand sets isInDemand
     * @param inputNumberOfUnits sets numberOfUnitsInStock
     */
    public RetailItem(String inputItemDesc, double ipnutItemPrice, boolean inputInDemand, int inputNumberOfUnits){
        if(inputItemDesc != null){
            itemDescription = inputItemDesc;
        }else{
            throw new IllegalArgumentException("Item Description cannot be null");
        }
        
        if(ipnutItemPrice > 0){
            itemPriceInCAD = ipnutItemPrice;
        }else{
            throw new IllegalArgumentException("Price cannot be 0 or negative");
        }
        
        if(inputNumberOfUnits >= 0){
            numberOfUnitsInStock = inputNumberOfUnits;
        }else{
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        
        isInDemand = inputInDemand;
    }
    
}