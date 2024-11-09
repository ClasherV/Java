public class StudentMain
{
    public static void main(String[] args)
    {
        StudentInfo obj = new StudentInfo();
        obj.name="Vaibhav";
        obj.roll_no=48;
        obj.age=19;
        obj.display();
    }
}
class StudentInfo
{
    String name;
    int roll_no;
    int age;
    void display()
    {
        System.out.println("The Student "+name+" has Roll Number: "+roll_no);
    }
}

// O/p: The Student Vaibhav has Roll Number: 48