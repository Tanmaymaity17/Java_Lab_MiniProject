package Model;
public class Operates
{
    // Creating objects
    Company ObjCom;
    Location ObjLoc;
    Branch ObjBrn;

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
    public void operates_com_loc(Company tempCom, Location tempLoc, Branch tempBrn)
    {
        ObjCom = tempCom;
        ObjLoc = tempLoc;
        ObjBrn = tempBrn;
    }

    // Display Method
    public void display()
    {
        System.out.println("\nOperation ID : " +getOperatesID() +  ".\nLocation City: " +this.ObjLoc.getCity()+".");
        System.out.println("Branch Code : " +this.ObjBrn.getBranchCode() + "\nBranch Manager : " +this.ObjBrn.getBranchManager() + "\nManager Contact: " +this.ObjBrn.getContactNO()+"\nBranch Email: "+this.ObjBrn.getBranchEmail()+"\nEmployee Count: "+this.ObjBrn.getEmpCount());
    }
}