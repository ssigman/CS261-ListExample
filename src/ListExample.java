import java.util.ArrayList;
import java.util.Iterator;

/**
 * Short Example of creating and using an ArrayList in Java.
 * 
 * @author S. Sigman
 * @version v1
 */
public class ListExample
{
    public static void main(String [] args) 
    { 
        // declare the student list
        ArrayList<Student> students = new ArrayList();
        
        // create student objects
        Student stu1 = new Student("Daffy Duck", "Sr");
        Student stu2 = new Student("Donald Duck", "Jr");
        Student stu3 = new Student("Daisy Duck", "Soph");
        Student stu4 = new Student("Huey Duck", "Fresh");
        Student stu5 = new Student("Dewy Duck", "Fresh");
        Student stu6 = new Student("Louie Duck", "Fresh");
        
        // show the status of the list
        if (students.isEmpty())
           System.out.println("The list Empty");
        else
           System.out.println("We should not have printed this method.");
        
        // put students in the list
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);
        students.add(stu6);
        
        // print the list length
        System.out.println("The number of students is: " + students.size());
        
        // print the first student in the list
        System.out.println("The first student in the list is: " +  students.get(0)); 
        
        // is object stu4 in the list
        int hueyPos = 0;
        if ((hueyPos = students.indexOf(stu4)) != -1)
        {
            System.out.println("The student at pos "+ hueyPos +" is "  
                                     + students.get(hueyPos));
        }
        else
            System.out.println("Huey should have been in the list.");
            
        // print the entire list
        System.out.println("\nThe roster:");
        Iterator<Student> stuIt = students.iterator();
        while (stuIt.hasNext())
        {
            System.out.println(stuIt.next());
        }
        
        // remove Dewy Duck and print a removal message
        Student removed = students.remove(4);
        System.out.println("Student removed: " + removed);
        
        // print the new list
        System.out.println("\nThe roster:");
        stuIt = students.iterator();
        while (stuIt.hasNext())
        {
            System.out.println(stuIt.next());
        }
    }
}
