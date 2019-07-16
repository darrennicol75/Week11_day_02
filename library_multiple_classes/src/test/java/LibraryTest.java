import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    //Add books to use in tests

    @Before
    public void setUp(){
        library = new Library("Carnegie", 5);
        book = new Book("Adaptive Markets", "Andrew Lo", "Finance");
        book1 = new Book("Security Analysis", "Ben Graham", "Investing");
        book2 = new Book("Irrational Exuberance", "Robert Shiller", "Economics");
        book3 = new Book("Value Investing", "Bruce Greenwald", "Investing");
        book4 = new Book("Valuation", "Kohler", "Finance");
        book5 = new Book("Taxation", "Melville", "Business");
    }

    //test count starts at zero

    @Test
    public void inventoryCountStartsAt0(){
        assertEquals(0, library.inventoryCount());
    }

    //test that you can add books to the inventory
    @Test
    public void canAddInventory(){
        library.addInventory(book);
        assertEquals(1, library.inventoryCount());
    }

    //test the function to see if more than the capacity can
    //be added

    @Test
    public void cantAddInventory(){
        library.addInventory(book);
        library.addInventory(book1);
        library.addInventory(book2);
        library.addInventory(book3);
        library.addInventory(book4);
        library.addInventory(book5);
        assertEquals(5, library.inventoryCount());
    }

    //test function for removing inventory

    @Test
    public void canRemoveInventory(){
        library.addInventory(book);
        library.removeInventory(book);
        assertFalse(library.getInventory().contains(book));
        assertEquals(0, library.inventoryCount());
    }
}
