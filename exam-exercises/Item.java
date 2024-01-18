/**
 * Single Item for the Shopping List
 */
public class Item
{
    String name;
    int amount;
    public Item(int amount,String name){
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
