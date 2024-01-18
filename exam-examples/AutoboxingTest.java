
import static org.junit.Assert.*;
import org.junit.After;

import org.junit.Test;
import java.util.*;

public class AutoboxingTest
{
    List<Integer> list = new ArrayList<>();
    @Test
    public void manualBoxing(){
        // boxing
        Integer x = new Integer(42);
        list.add(x);
        Integer result = list.get(0);
        // unboxing
        int i = result.intValue();
        assertEquals(42,i);
    }

    @Test
    public void autoBoxing(){
        // autoboxing
        list.add(42);
        // autounboxing
        int value = list.get(0);
        assertEquals(42,value);
        // but the box exists!
        Integer element = list.get(0);
        assertEquals(42,element.intValue());
    }
}
