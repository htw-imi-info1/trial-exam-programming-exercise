
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShoppingListTest.
 *
 * @author  Barne Kleinen
 */
public class ShoppingListTest
{
    ShoppingList list;
    /**
     * Default constructor for test class ShoppingListTest
     */
    public ShoppingListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new ShoppingList();
    }

    @Test
    public void testList(){
        list.add(new Item(3, "Garlic"));
        list.add(new Item(5, "Onions"));
        list.add(new Item(6, "Eggs"));
        list.add(new Item(10, "Nuts"));
        list.add(new Item(1, "Hummus"));
        String expected = "3 Garlic\n5 Onions\n6 Eggs\n10 Nuts\n1 Hummus\n";
        assertEquals(expected,list.getList());
    }
}
