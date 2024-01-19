import java.util.Collection;
import java.util.ArrayList;
/**
 * The ShoppingList should hold a Collection
 * of Items. Your task is to implement the 
 * getList method.  
 * 
 * @author Barne Kleinen
 */
public class ShoppingList
{
    // this field holds a collection of items.
    // you need to initialize it with an matching
    // collection type in the Constructor.
    private Collection<Item> items; 

    /**
     * Constructor for objects of class ShoppingList
     */
    public ShoppingList()
    {
         items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }

    /**
     * Your task is to implement this method.
     * It should return a String containing all
     * amounts followed by a space followed by the names of the items added to the ShoppingList, 
     * separated by a newline.
     * Example: 2 Eggs\n1 Milk\n3 Bread\n
     * 
     * @return     a String containing all items on the list separated by 
     *             newline ("\n")
     */
    public String getList()
    {
        return null;
    }
}
