package Model;

/**
 * Identification comments:
 *   Name: Tanmay Maity
 *   Experiment No: 01
 *   Experiment Title: Implementing many-to-many relationship using classes and objects
 *   Experiment Date: 28/07/2023
 *   @version 1.0

 * Beginning comments:
 * Filename: Company.java
 * @author:  Tanmay Maity
 * Overview: This class is created to store the attributes of class Company

 * Attribute comments:
 * companyID : It stores Company Id
 * companyName : It stores Company Name
 * industry : It stores Industry Type
 * sector : It stores Company's Sector
 * foundedIn : It stores Company's Foundation Year
 * ceo : It stores Company's CEO's Name
 * revenue : It stores Company's overall Revenue
 */

public class Company
{
    /* Company attributes */
    private int companyID;
    private String companyName;
    private String industry;
    private String sector;
    private String ceo;
    private int foundedIn;
    private long revenue;

    // Setters
    public void setCompanyID(int companyID)
    {
        this.companyID = companyID;
    }
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    public void setIndustry(String industry)
    {
        this.industry = industry;
    }
    public void setSector(String sector)
    {
        this.sector = sector;
    }
    public void setCeo(String ceo)
    {
        this.ceo = ceo;
    }
    public void setFoundedIn(int foundedIn)
    {
        this.foundedIn = foundedIn;
    }
    public void setRevenue(long revenue) { this.revenue = revenue; }

    // Getters
    public int getCompanyId()
    {
        return this.companyID;
    }
    public String getCompanyName()
    {
        return this.companyName;
    }
    public String getIndustry()
    {
        return this.industry;
    }
    public String getSector()
    {
        return this.sector;
    }
    public String getCeo()
    {
        return this.ceo;
    }
    public int getFoundedIn()
    {
        return this.foundedIn;
    }
    public long getRevenue() { return this.revenue; }
}