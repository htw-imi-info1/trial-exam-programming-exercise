

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ATest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ATest
{
    @Test
    public void countInstances(){
        for(int i =0;i<100;i++){
            new A();
        }
        assertEquals(100,A.numberOfCreatedInstances());
        assertEquals(3.14,A.PI);
        
    }
    
}
