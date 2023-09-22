import Model.Company;
import Model.Location;
import Model.Operates;
public class Main {
    public static

    void main(String[] args) {
        // Company
        Company[] com_array;
        com_array = new Company[5];
        com_array[0] = new Company();
        com_array[0].setCompanyID(1);
        com_array[0].setCompanyName("KFC");
        com_array[1] = new Company();
        com_array[1].setCompanyID(2);
        com_array[1].setCompanyName("L&T");
        com_array[2] = new Company();
        com_array[2].setCompanyID(3);
        com_array[2].setCompanyName("TCS");
        com_array[3] = new Company();
        com_array[3].setCompanyID(4);
        com_array[3].setCompanyName("Infosys");
        com_array[4] = new Company();
        com_array[4].setCompanyID(5);
        com_array[4].setCompanyName("TATA");
        // Location
        Location[] loc_array;
        loc_array = new Location[5];
        loc_array[0] = new Location();
        loc_array[0].setLocationID(1);
        loc_array[0].setCity("Mumbai");
        loc_array[1] = new Location();
        loc_array[1].setLocationID(2);
        loc_array[1].setCity("Kolkata");
        loc_array[2] = new Location();
        loc_array[2].setLocationID(3);
        loc_array[2].setCity("Chennai");
        loc_array[3] = new Location();
        loc_array[3].setLocationID(4);
        loc_array[3].setCity("Delhi");
        loc_array[4] = new Location();
        loc_array[4].setLocationID(5);
        loc_array[4].setCity("Bengaluru");
        // Operates
        Operates[] operates_array;
        operates_array = new Operates[5];
        operates_array[0] = new Operates();
        operates_array[1] = new Operates();
        operates_array[2] = new Operates();
        operates_array[3] = new Operates();
        operates_array[4] = new Operates();
        operates_array[0].operates_com_loc(com_array[4], loc_array[0]);
        operates_array[1].operates_com_loc(com_array[4], loc_array[1]);
        operates_array[2].operates_com_loc(com_array[4], loc_array[2]);
        operates_array[3].operates_com_loc(com_array[3], loc_array[3]);
        operates_array[4].operates_com_loc(com_array[3], loc_array[4]);
        System.out.println("Company: " + com_array[4].getCompanyName() + ", Operates at: ");
        System.out.println("----------------------------------");
        operates_array[0].display(1);
        operates_array[1].display(2);
        operates_array[2].display(3);
        System.out.println("\n-----------------------------\n");
        System.out.println("Company: " + com_array[3].getCompanyName() + ", Operates at: ");
        System.out.println("----------------------------------");
        operates_array[3].display(4);
        operates_array[4].display(5);
        System.out.println("\n-----------------------------\n");
    }
}