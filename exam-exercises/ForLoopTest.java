
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ForLoopTest
{
    /**
     * Default constructor for test class ForLoopTest
     */
    public ForLoopTest()
    {
    }
    ForLoop forLoop = new ForLoop();
   
    @Test
    public void testOne2Four(){
        int[] a = {1,2,3,4};
        assertEquals(10,forLoop.sum(a));
    }
    
      @Test
    public void test2Ten(){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(55,forLoop.sum(a));
    }
}
