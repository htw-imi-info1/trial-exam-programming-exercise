
public class A
{
    public static final double PI = 3.14;
    static int  numberOfCreatedInstances = 0;
    public A(){
        numberOfCreatedInstances++;
    }

    public static int numberOfCreatedInstances(){
        return numberOfCreatedInstances;}
}
