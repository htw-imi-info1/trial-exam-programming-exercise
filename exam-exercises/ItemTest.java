

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ItemTest.
 *
 * @author  Barne Kleinen
 */
public class ItemTest
{
    private Item item1;

    /**
     * Default constructor for test class ItemTest
     */
    public ItemTest()
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
        item1 = new Item(3,  "Onion");
    }


    @Test
    public void testToString()
    {
        assertEquals( "3 Onion", item1.toString());
    }
}

