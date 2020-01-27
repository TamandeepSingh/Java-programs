/**
 * @author Tamandeep Singh
 * @version lab-7B-1.0
 */
public class Stock{
    private String stockSymbol;
    private double sharePrice;
    
    /**
     * Stock Constructor
     *
     * @param inputStockSymbol A parameter
     * @param inputSharePrice A parameter
     */
    public Stock(String inputStockSymbol, double inputSharePrice){
        setStockSymbol(inputStockSymbol);
        setSharePrice(inputSharePrice);
    }
    
    /**
     * Stock Constructor
     *
     */
    public Stock(){
        stockSymbol = "unknown";
        sharePrice = 0;
    }
    
    /**
     * Method setStockSymbol
     *
     * @param inputStockSymbol A parameter
     */
    public void setStockSymbol(String inputStockSymbol){
        if(inputStockSymbol != null){
            stockSymbol = inputStockSymbol;
        }else{
            throw new IllegalArgumentException("stock symbol cannot be null");
        }
    }
    
    /**
     * Method setSharePrice
     *
     * @param inputSharePrice A parameter
     */
    public void setSharePrice(double inputSharePrice){
        if(inputSharePrice > 0){
            sharePrice = inputSharePrice;
        }else{
            throw new IllegalArgumentException("Share price cannot be negative or zero");
        }
    }
    
    /**
     * Method getStockSymbol
     *
     * @return The return value
     */
    public String getStockSymbol(){
        return stockSymbol;
    }
    
    /**
     * Method getSharePrice
     *
     * @return The return value
     */
    public double getSharePrice(){
        return sharePrice;
    }
    
    /**
     * Method displayDetails
     *
     * @param numOfShares A parameter
     * @param totalCost A parameter
     */
    public void displayDetails(int numOfShares , double totalCost){
        System.out.println("Stock Symbol : " + getStockSymbol());
        System.out.println("Share price : " + getSharePrice());
        System.out.println("Number of shares purchased : " + numOfShares);
        System.out.println("Total cost : " + totalCost);
    }
    
}
