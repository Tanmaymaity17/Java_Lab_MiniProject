package Model;
import java.util.Calendar;
import java.util.Date;
public class Enrolls{
    private Calendar enrollment_date;
    Student ObjStud;
    Course ObjCourse;

    public void enroll_stud_course(Student tempStud, Course tempCourse, Calendar temp_enroll_date)
    {
        ObjStud = tempStud;
        ObjCourse = tempCourse;
        enrollment_date = temp_enroll_date;
    }
}
