package Model;
import java.lang.Math;

import java.util.ArrayList;
import java.util.Date;

/**
 * Identification comments:
 *   Name: Richard Joseph
 *   Experiment No:
 *   Experiment Title:
 *   Experiment Date:
 *   @version 1.0
 *
 *
 * Beginning comments: 
 * Filename: Student.java
 * @author:  Richard Joseph
 * /*  Overview: This class is created to store the attributes of Student. It is a subclass of the class "Person" which inherits
some of the attributes from the Person class. And the class representing the "Person" object implements the interface named 
"Table Member".
 *
 * Attribute comments: 
 * id : Its Student Id
 * Name :
 * DOB : 
 *
 *
 */

public class Student{

    /* Student attributes */
    private int id;
    private String name;
    private Date dob;
    private long mobile_no;
    private String email;
    private String gender;
    private String category;
    private double per_10th;
    private double per_12_dip;

    public void setStudentId()
    {
        this.id = (int) Math.random();
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setDOB(Date dob)
    {
        this.dob = dob;
    }

    public void setMobileNo(long mobile_no)
    {
        this.mobile_no = mobile_no;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setPer_10th(double per_10th)
    {
        this.per_10th = per_10th;
    }

    public void setPer_12_dip(double per_12_dip)
    {
        this.per_12_dip = per_12_dip;
    }

    public int getStudentId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }

    public Date getDOB()
    {
        return this.dob;
    }

    public long getMobileNo()
    {
        return this.mobile_no;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getCategory()
    {
        return this.category;
    }

    public double getPer_10th()
    {
        return this.per_10th;
    }

    public double getPer_12_dip()
    {
        return this.per_12_dip;
    }
}
