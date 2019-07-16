import java.util.ArrayList;

public class Borrower {

    //Create borrower class each having a name and
    // collection

    private String name;
    private ArrayList<Book> rentals;

    //Create instance of Borrower

    public Borrower(String name){
        this.name = name;
        this.rentals = new ArrayList<Book>();
    }

    //Create function to return the rentals volume when called

    public int rentalsVolume(){
        return this.rentals.size();
    }

    //Create function to add book to borrower rentals

    public void add(Book book){
        this.rentals.add(book);
    }

    //Create function to remove book from borrower rentals

    public Book removeFromRentals(){
        Book bookRemoved = null;
        if(this.rentalsVolume() > 0){
            bookRemoved = this.rentals.remove(0);
        }
        return bookRemoved;
    }
}
