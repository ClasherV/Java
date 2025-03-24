public class Static
{
    static int age=19;
    static int roll_no;
    static int marks;
    static void display()
    {
        System.out.println("Roll Number: "+roll_no);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args)
    {
        roll_no=48;
        display();
        System.out.println(marks);
    }
}

// O/p: Roll Number: 48
//      Age: 19
//      0