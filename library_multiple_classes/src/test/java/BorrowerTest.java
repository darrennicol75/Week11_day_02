import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void setUp(){
        borrower = new Borrower("Albert Einstien");
        book = new Book("Security Analysis", "Ben Graham", "Investing");
    }

    //Create test to add book to borrower hires

    @Test
    public void canAddToRentals(){
        borrower.add(book);
        assertEquals(1, borrower.rentalsVolume());
    }

    //Create test to remove book from rentals

    @Test
    public void canRemoveFromRentals(){
        borrower.add(book);
        borrower.removeFromRentals();
        assertEquals(0, borrower.rentalsVolume());
    }
}
