package Model;
public class Operates
{
    // Creating Objects
    Company ObjCom;
    Location ObjLoc;

    // Operates Attributes
    private int operatesID;

    // Setters
    public void setOperatesID(int operatesID)
    {
        this.operatesID = operatesID;
    }

    // Getters
    public int getOperatesID()
    {
        return this.operatesID ;
    }
    public void operates_com_loc(Company tempCom, Location tempLoc)
    {
        ObjCom = tempCom;
        ObjLoc = tempLoc;
    }

    // Display Function
    public void display()
    {
        System.out.println("\nOperation ID : " +getOperatesID() +  ".\nLocation City: " +this.ObjLoc.getCity()+".");
    }
}