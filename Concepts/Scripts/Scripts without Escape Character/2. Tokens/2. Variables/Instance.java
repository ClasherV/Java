public class Instance
{
    int age=19;
    int roll_no;
    int marks;
    void display()
    {
        System.out.println("Roll Number: "+roll_no);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args)
    {
        Instance obj=new Instance();
        obj.roll_no=48;
        obj.display();
        System.out.println(obj.marks);
    }
}

// O/p: Roll Number: 48
//      Age: 19
//      0