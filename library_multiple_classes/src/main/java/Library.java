import java.util.ArrayList;

public class Library {

    // name the library

    private String name;

    // give library a capacity

    private int capacity;

    //give the library an array of books called inventory

    private ArrayList<Book> inventory;

    //create instance of the class

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.inventory = new ArrayList<Book>();
    }

    // Create a getter function that gets the inventory

    public ArrayList<Book> getInventory(){
        return inventory;
    }

    // create a function that returns the count of inventory when called

    public int inventoryCount(){
        return this.inventory.size();
    }

    //create a function that adds inventory

    public void addInventory(Book book){
        if (this.inventoryCount() < this.capacity){
            this.inventory.add(book);
        }
    }

    //create a function to remove inventory

    public void removeInventory(Book book){
        this.inventory.remove(book);
    }

}
