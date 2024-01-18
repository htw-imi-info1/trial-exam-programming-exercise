import org.junit.Test;
import static org.junit.Assert.*;
public class BTest
{
    @Test
    public void AisNotaB(){
        // B x = new A();
    }

    @Test
    public void BisaA(){
        A x = new B();
        //x = new A();
        // does not compile
        // x.methodOnlyDefinedInB();
        B castedReference = (B)x;
        assertEquals("methodOnlyDefinedInB",
            castedReference.methodOnlyDefinedInB());

    }

    @Test
    public void CisaA(){
        A x = new C();
        // x = new A();
        // does not compile
        // x.methodOnlyDefinedInB();
        B castedReference = (B)x;
        assertEquals("methodOnlyDefinedInB",
            castedReference.methodOnlyDefinedInB());

    }

    @Test
    public void AcannotBeCastedToB(){
        A x = new B();
        x = new A();
        // does not compile
        // x.methodOnlyDefinedInB();
        B castedReference = (B)x;
        assertEquals("methodOnlyDefinedInB",
            castedReference.methodOnlyDefinedInB());

    }
}
