package Model;
public class Operates
{
    //creating objects
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
    //display function
    public void display(int operatesID)
    {
        System.out.println("\nOperaƟon ID : " + operatesID + ".");
        System.out.println("LocaƟon ID: "+this.ObjLoc.getLocationID()+"\nLocation city : " + this.ObjLoc.getCity());
    }
}