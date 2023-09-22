package Model;

import java.util.Scanner;

/**
 * Identification comments:
 * Name: Tanmay Maity
 * Experiment No: 03
 * Experiment Title: Implementing Polymorphism using Constructor overloading and String manipulations
 * Experiment Date: 11/08/2023
 * @version 1.0

 * Beginning comments:
 * Filename: Branch.java
 * @author:  Tanmay Maity
 * Overview: This class is created to store the attributes of class Branch

 * Attribute comments:
 * branchID : It stores Branch ID of Branch
 * branchCode : It stores Code of the Branch
 * branchManager : It stores Manager Name of the Branch
 * branchEmail : It stores Email of the Branch
 * contactNo : It stores Contact No. of the Manager
 * empCount : It stores the Number of Employees of the Branch
 */

public class Branch
{
    // Branch Attributes
    private int branchID;
    private String branchCode;
    private String branchManager;
    private String branchEmail;
    private int contactNO;
    private int empCount;

    // Setters
    public void setBranchID(int branchID){ this.branchID = branchID; }
    public void setBranchCode(String branchCode){ this.branchCode = branchCode; }
    public void setBranchManager(String branchManager){ this.branchManager = branchManager; }
    public void setBranchEmail(String branchEmail){ this.branchEmail = branchEmail; }
    public void setContactNO(int contactNO){ this.contactNO = contactNO; }
    public void setEmpCount(int empCount){ this.empCount = empCount; }

    // Getters
    public int getBranchID(){ return this.branchID; }
    public String getBranchCode(){ return this.branchCode; }
    public String getBranchManager(){ return this.branchManager; }
    public String getBranchEmail(){ return this.branchEmail; }
    public int getContactNO(){ return this.contactNO; }
    public int getEmpCount(){ return this.empCount; }

    Scanner scanner = new Scanner(System.in);

    // Constructors (Function Overloading)
    public Branch(int branchID,String branchCode,String branchManager,String branchEmail,int contactNO,int empCount)
    {
        setBranchID(branchID);
        setBranchCode(branchCode);
        setBranchManager(branchManager);
        setBranchEmail(branchEmail);
        setContactNO(contactNO);
        setEmpCount(empCount);
    }
    public Branch(int branchID,String branchManager,int contactNO,int empCount)
    {
        setBranchID(branchID);
        System.out.print("Enter City Name: ");
        String city = scanner.nextLine();
        setBranchCode(convertCityToCode(city));
        setBranchManager(branchManager);
        setBranchEmail(createEmail(this.getBranchManager()));
        setContactNO(contactNO);
        setEmpCount(empCount);
    }

    // Function to Convert City Name into Branch Code
    public static String convertCityToCode(String city_name)
    {
        String branch_code="a";
        if(city_name.length() >= 3)
        {
            branch_code = city_name.substring(0,3).toUpperCase();
        }
        else
        {
            System.out.println("The City Name is too short. ");
        }
        return branch_code;
    }

    // Function to Create Auto Generated Email
    public static String createEmail(String manager_name)
    {
        String email="a";
        String[] nameParts = manager_name.split(" ");
        if(nameParts.length >= 2)
        {
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            email = firstName.toLowerCase()+ "@gmail.com";
        }
        else
        {
            System.out.println("Invalid Manager Name Format.");
        }
        return email;
    }

    // Function to Change Branch Details
    public void changeDetails(String newManager, int newContact, int empCount)
    {
        System.out.println("Old Branch Details: ");
        System.out.println("\nBranch Manager Name: "+this.getBranchManager());
        System.out.println("Branch Manager Contact: "+this.getContactNO());
        System.out.println("Branch Employee Count: "+this.getEmpCount());

        setBranchManager(newManager);
        setContactNO(newContact);
        setEmpCount(empCount);

        System.out.println("New Branch Details: ");
        System.out.println("\nBranch Manager Name: "+this.getBranchManager());
        System.out.println("Branch Manager Contact: "+this.getContactNO());
        System.out.println("Branch Employee Count: "+this.getEmpCount());
    }
}