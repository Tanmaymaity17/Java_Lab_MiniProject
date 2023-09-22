package Model;

import java.util.Date;

public class Course{
    /* Course attributes */
    private int id;
    private String course_name;
    private String course_desc;
    private int course_fees;
    private int course_duration_months;

    public void setCourseId()
    {
        this.id = (int) Math.random();
    }
    public void setCourseName(String course_name)
    {
        this.course_name = course_name;
    }

    public void setCourseDesc(String course_desc)
    {
        this.course_desc = course_desc;
    }

    public void setCourseFees(int course_fees)
    {
        this.course_fees = course_fees;
    }
    public void setCourseDurationMonths(int course_duration_months)
    {
        this.course_duration_months = course_duration_months;
    }

    public int getCourseId()
    {
        return this.id;
    }

    public String getCourseName()
    {
        return this.course_name;
    }

    public String getCourseDesc()
    {
        return this.course_desc;
    }

    public int getCourseFees()
    {
        return this.course_fees;
    }
    public int getCourseDurationMonths()
    {
        return this.course_duration_months;
    }

}
