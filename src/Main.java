import Model.Company;
import Model.Location;
import Model.Operates;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int currentCompanyCount = 0;
        int currentLocationCount = 0;
        int currentOperationCount = 0;

        Scanner scanner = new Scanner(System.in);

        Company[] com_array;
        com_array = new Company[100];

        Location[] loc_array;
        loc_array = new Location[20];

        Operates[] operates_array;
        operates_array = new Operates[200];

        int choice;
        do
        {
            System.out.println("Menu: ");
            System.out.println("\n1. Add a new Company.");
            System.out.println("2. Display a Company.");
            System.out.println("3. Add a new Location.");
            System.out.println("4. Display a Location.");
            System.out.println("5. Add an Operation.");
            System.out.println("6. Display all Operation.");
            System.out.println("7. Exit.");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.println("--------------------------------------------------------");

            switch (choice)
            {
                case 1:
                    if (currentCompanyCount < com_array.length)
                    {
                        System.out.print("Enter Company Name: ");
                        String companyName = scanner.nextLine();

                        System.out.print("Enter Industry Type: ");
                        String industry = scanner.nextLine();

                        System.out.print("Enter Sector Type: ");
                        String sector = scanner.nextLine();

                        System.out.print("Enter Ceo Name: ");
                        String ceo = scanner.nextLine();

                        System.out.print("Enter Founding Year: ");
                        int foundedIn = scanner.nextInt();

                        System.out.print("Enter Company Revenue In Billions: ");
                        int revenue = scanner.nextInt();

                        System.out.print("Enter No. of Branches: ");
                        int nob = scanner.nextInt();

                        com_array[currentCompanyCount] = new Company();
                        currentCompanyCount++;

                        com_array[currentCompanyCount-1].setCompanyID(currentCompanyCount);
                        com_array[currentCompanyCount-1].setCompanyName(companyName);
                        com_array[currentCompanyCount-1].setIndustry(industry);
                        com_array[currentCompanyCount-1].setSector(sector);
                        com_array[currentCompanyCount-1].setCeo(ceo);
                        com_array[currentCompanyCount-1].setFoundedIn(foundedIn);
                        com_array[currentCompanyCount-1].setRevenue(revenue);
                        com_array[currentCompanyCount-1].setNob(nob);

                        System.out.println("Company created and added to the array. ");
                        System.out.println("--------------------------------------------------------");
                    }
                    else
                    {
                        System.out.println("Array is full !! Cannot create more Companies. ");
                    }
                    break;

                case 2:
                    System.out.print("Enter Id of the Company to Display: ");
                    int com_id_display = scanner.nextInt();

                    System.out.println("Company ID : "+ com_array[com_id_display - 1].getCompanyId());
                    System.out.println("Company Name : "+ com_array[com_id_display - 1].getCompanyName());
                    System.out.println("Company Industry Type : "+ com_array[com_id_display - 1].getIndustry());
                    System.out.println("Company Sector Type : "+ com_array[com_id_display - 1].getSector());
                    System.out.println("Company Ceo Name: "+ com_array[com_id_display - 1].getCeo());
                    System.out.println("Company Founding Year : "+ com_array[com_id_display - 1].getFoundedIn());
                    System.out.println("Company Revenue : "+ com_array[com_id_display - 1].getRevenue());
                    System.out.println("Company No. of Branches : "+ com_array[com_id_display - 1].getNob());
                    System.out.println("--------------------------------------------------------");
                    break;

                case 3:
                    if (currentLocationCount < loc_array.length)
                    {
                        System.out.print("Enter Country Name: ");
                        String country = scanner.nextLine();

                        System.out.print("Enter Region: ");
                        String region = scanner.nextLine();

                        System.out.print("Enter State Name: ");
                        String state = scanner.nextLine();

                        System.out.print("Enter City Name: ");
                        String city = scanner.nextLine();

                        System.out.print("Enter Pincode: ");
                        int pincode = scanner.nextInt();

                        // Create the object dynamically
                        loc_array[currentLocationCount] = new Location();
                        currentLocationCount++;

                        loc_array[currentLocationCount-1].setLocationID(currentLocationCount);
                        loc_array[currentLocationCount-1].setCountry(country);
                        loc_array[currentLocationCount-1].setRegion(region);
                        loc_array[currentLocationCount-1].setState(state);
                        loc_array[currentLocationCount-1].setCity(city);
                        loc_array[currentLocationCount-1].setPincode(pincode);

                        System.out.println("Location created and added to the array.");
                        System.out.println("--------------------------------------------------------");
                    }
                    else
                    {
                        System.out.println("Array is full !! Cannot create more Locations. ");
                    }
                    break;

                case 4:

                    System.out.print("Enter Id of the Location to Display: ");
                    int loc_id_display = scanner.nextInt();

                    System.out.println("Location Id : "+ loc_array[loc_id_display - 1].getLocationID());
                    System.out.println("Location Country Name : "+ loc_array[loc_id_display - 1].getCountry());
                    System.out.println("Location Region  : "+ loc_array[loc_id_display - 1].getRegion());
                    System.out.println("Location State Name : "+ loc_array[loc_id_display - 1].getState());
                    System.out.println("Location City Name : "+ loc_array[loc_id_display - 1].getCity());
                    System.out.println("Location Pincode : "+ loc_array[loc_id_display - 1].getPincode());
                    System.out.println("--------------------------------------------------------");
                    break;

                case 5:
                    if (currentOperationCount < operates_array.length)
                    {
                        System.out.print("Enter Id of the Operation: ");
                        int selected_operate_id = scanner.nextInt();
                        System.out.print("Enter Id of the Company to Operate: ");
                        int selected_company_id = scanner.nextInt();
                        System.out.print("Enter Id of the Location to Operate: ");
                        int selected_location_id = scanner.nextInt();
                        operates_array[currentOperationCount] = new Operates();
                        currentOperationCount++;
                        operates_array[currentOperationCount-1].setOperatesID(selected_operate_id);
                        operates_array[currentOperationCount-1].operates_com_loc(com_array[selected_company_id - 1],loc_array[selected_location_id - 1]);
                        System.out.println("Operation created and added to the array. ");
                        System.out.println("--------------------------------------------------------");
                    }
                    else
                    {
                        System.out.println("Array is full !! Cannot create more Operations. ");
                    }
                    break;

                case 6:
                    int i,j,l,m=0;
                    for( i=0; i<currentCompanyCount ; i++)
                    {
                        int k=com_array[i].getNob();
                        l=m;
                        System.out.println("Company: "+com_array[i].getCompanyName() +", Operates at: ");
                        System.out.println("----------------------------------");
                        for( j=0 ; j < k; j++)
                        {
                            operates_array[l].display();
                            m=l+1;
                            l++;
                        }
                        System.out.println("--------------------------------------------------------");
                    }
                    System.out.println("--------------------------------------------------------");
                    break;

                case 7:

                    System.out.println("Exiting...");
                    System.out.println("--------------------------------------------------------");
                    break;

                default:
                    System.out.println("Invalid choice !! Try again. ");
                    System.out.println("--------------------------------------------------------");
                    break;
            }
        }
        while (choice != 7);
        scanner.close();
    }
}