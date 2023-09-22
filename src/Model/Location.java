package Model;

/**
 * Identification comments:
 *   Name: Tanmay Maity
 *   Experiment No: 01
 *   Experiment Title: Implementing many-to-many relationship using classes and objects
 *   Experiment Date: 28/07/2023
 *   @version 1.0

 * Beginning comments:
 * Filename: Location.java
 * @author:  Tanmay Maity
 * Overview: This class is created to store the attributes of class Location

 * Attribute comments:
 * locationID : It stores Location ID of Location
 * country : It stores Country of the Location
 * region : It stores Region of Location
 * state : It stores State of Location
 * city : It stores City of Location
 * pincode : It stores Pincode of Location
 */

public class Location
{
    /* Location attributes */
    private int locationID;
    private String country;
    private String region;
    private String state;
    private String city;
    private long pincode;

    // Setters
    public void setLocationID(int locationID)
    {
        this.locationID = locationID;
    }
    public void setCountry(String country){ this.country = country; }
    public void setRegion(String region)
    {
        this.region = region;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setPincode(long pincode)
    {
        this.pincode = pincode;
    }

    // Getters
    public int getLocationID()
    {
        return this.locationID;
    }
    public String getCountry() { return this.country; }
    public String getRegion()
    {
        return this.region;
    }
    public String getState()
    {
        return this.state;
    }
    public String getCity()
    {
        return this.city;
    }
    public long getPincode()
    {
        return this.pincode;
    }
}