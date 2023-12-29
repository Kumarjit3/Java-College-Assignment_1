package std;

public class Student
{
    private String Name;
    private int Roll;
    private int Age;

    public Student()
    {
        this.Name = null;
        this.Roll = 0;
        this.Age = 00;
    }

    public void setStudent(String Name,int Roll,int Age)
    {
        this.Name = Name;
        this.Roll = Roll;
        this.Age = Age;
    }

    public void showStudent()
    {
        System.out.print("\n\nStudent Name : "+this.Name);
        System.out.print("\nStudent Roll : "+this.Roll);
        System.out.print("\nStudent Age : "+this.Age);
    }
    
}