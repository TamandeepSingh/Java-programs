/**
 * @author Tamandeep Singh
 * @version lab-10B
 */
public class Book{
    private String titleOfBook;
    private String authorOfBook;
    private int yearOfPublish;
    private double bookPriceInCAD;
    
    /**
     * Book Constructor
     *
     * @param inputTitle A parameter
     * @param inputAuthorOfBook A parameter
     * @param inputYear A parameter
     * @param inputPrice A parameter
     */
    public Book(String inputTitle, String inputAuthorOfBook, int inputYear, double inputPrice){
        setTitleOfBook(inputTitle);
        setAuthorOfBook(inputAuthorOfBook);
        setYearOfPublish(inputYear);
        setBookPriceInCAD(inputPrice);
    }
    
    /**
     * Method setTitleOfBook
     *
     * @param inputTitle A parameter
     */
    public void setTitleOfBook(String inputTitle){
        if(inputTitle == null){
            throw new IllegalArgumentException("book title cannot be null");
        }else if(inputTitle.isEmpty()){
            throw new IllegalArgumentException("book title cannot be empty");
        }else{
            titleOfBook = inputTitle;
        }
    }
    
    /**
     * Method setAuthorOfBook
     *
     * @param inputAuthorOfBook A parameter
     */
    public void setAuthorOfBook(String inputAuthorOfBook){
        if(inputAuthorOfBook == null){
            throw new IllegalArgumentException("book author cannot be null");
        }else if(inputAuthorOfBook.isEmpty()){
            throw new IllegalArgumentException("book author cannot be empty");
        }else{
            authorOfBook = inputAuthorOfBook;
        }
    }
    
    /**
     * Method setYearOfPublish
     *
     * @param inputYear A parameter
     */
    public void setYearOfPublish(int inputYear){
        if(inputYear > 0 && inputYear < 2020){
            yearOfPublish = inputYear;
        }else{
            if(inputYear < 0){
                throw new IllegalArgumentException("Publish year cannot be negative.");
            }else{
                throw new IllegalArgumentException("Publish year cannot be greater than current year");
            }
        }
    }
    
    /**
     * Method setBookPriceInCAD
     *
     * @param inputPrice A parameter
     */
    public void setBookPriceInCAD(double inputPrice){
        if(inputPrice > 0){
            bookPriceInCAD = inputPrice; 
        }else{
            throw new IllegalArgumentException("price cannot be negative.");
        }
    }
    
    /**
     * Method getTitleOfBook
     *
     * @return The return value
     */
    public String getTitleOfBook(){
        return titleOfBook;
    }
    
    /**
     * Method getAuthorOfBook
     *
     * @return The return value
     */
    public String getAuthorOfBook(){
        return authorOfBook;
    }
    
    /**
     * Method getYearOfPublish
     *
     * @return The return value
     */
    public int getYearOfPublish(){
        return yearOfPublish;
    }
    
    /**
     * Method getBookPriceInCAD
     *
     * @return The return value
     */
    public double getBookPriceInCAD(){
        return bookPriceInCAD;
    }
    
    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println("Name of the book : " + getTitleOfBook());
        System.out.println("Name of the author : " + getAuthorOfBook());
        System.out.println("Year of publish : " + getYearOfPublish());
        System.out.println("Price of book in CAD : "+ getBookPriceInCAD());
    }
    
}
