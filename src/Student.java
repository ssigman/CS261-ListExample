
/**
 * Simple Student class used in the example.
 * 
 * @author S. Sigman
 * @version 1.0
 */
public class Student
{
    private String name;        // full name
    private String yearInSchool;// Fresh, Soph, Jr, Sr

    public Student(String name, String yearInSchool)
    {
        this.name = name;
        this.yearInSchool = yearInSchool;
    }
    
    public Student()
    {
        this.name = "";
        this.yearInSchool = "";
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public String getYearInSchool()
    {
        return this.yearInSchool;
    }
    
    public void setYearInSchool(String yearInSchool)
    {
        this.yearInSchool = yearInSchool;
    }
    
    public String toString() 
    {
       return this.name + " year: " + this.yearInSchool;
    }
}
