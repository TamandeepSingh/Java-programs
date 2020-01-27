/**
 * @author Tamandeep Singh
 * @version lab-10B
 */
import java.util.ArrayList;
public class BookStore{
    private String businessName;
    private ArrayList<Book> listOfBooks;
    
    /**
     * BookStore Constructor
     *
     */
    public BookStore(){
        businessName = "Book Store";
        listOfBooks = new ArrayList<Book>();
    }
    
    /**
     * BookStore Constructor
     *
     * @param inputBusinessName A parameter
     */
    public BookStore(String inputBusinessName){
        businessName = inputBusinessName;
        listOfBooks = new ArrayList<Book>();
    }
    
    /**
     * Method setBusinessName
     *
     * @param inputBusinessName A parameter
     */
    public void setBusinessName(String inputBusinessName){
        if(inputBusinessName == null){
            throw new IllegalArgumentException("business name cannot be null");
        }else if(inputBusinessName.isEmpty()){
            throw new IllegalArgumentException("business name cannot be empty");
        }else{
            businessName = inputBusinessName;
        }
    }
    
    /**
     * Method GetBusinessName
     *
     * @return The return value
     */
    public String GetBusinessName(){
        return businessName;
    }
    
    /**
     * Method addBook
     *
     * @param book A parameter
     */
    public void addBook(Book book){
        if(book != null){
            listOfBooks.add(book);
        }else{
            System.out.println("Book is null");
        }
    }
    
    /**
     * Method getBookDetails
     *
     * @param index A parameter
     */
    public void getBookDetails(int index){
        if(index > 0 && index < listOfBooks.size()){
            Book book1 = listOfBooks.get(index);
            book1.displayDetails();
        }else{
            System.out.println("No book present with index " + index);
        }
    }
    
    /**
     * Method getSearchBook
     *
     * @param bookName A parameter
     */
    public void getSearchBook(String bookName){
        
        for(Book b1: listOfBooks){
            if(b1.getTitleOfBook().equalsIgnoreCase(bookName)){
                b1.displayDetails();
                break;
            }else if(listOfBooks.indexOf(b1) >= (listOfBooks.size() - 1)){
                System.out.println("Entered book is not available");
            }
        }
    }
    
    /**
     * Method getAllBooks
     *
     */
    public void getAllBooks(){
        for(Book b1: listOfBooks){
            b1.displayDetails();
        }
    }
    
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        Book b1 = new Book("python", "python author", 2012, 23.99);
        Book b2 = new Book("java", "java author", 2010, 20.99);
        Book b3 = new Book("javaScript", "javaScript author", 2015, 13.99);
        BookStore store = new BookStore("Best Book Store");
        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.getBookDetails(4);
        store.getBookDetails(2);
        store.getSearchBook("c++");
        store.getSearchBook("java");
        store.getAllBooks();
        
    }
    
}
