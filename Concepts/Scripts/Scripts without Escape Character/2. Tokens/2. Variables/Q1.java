public class Q1
{
    static int count;
    void display()
    {
        count++;
        System.out.println("Count: "+count);
    }
    public static void main(String[] args)
    {
        Q1 obj=new Q1();
        obj.display();
        obj.display();
        obj.display();
        obj.display();
        obj.display();
        obj.display();
    }
}

// O/p: Count: 1
//      Count: 2
//      Count: 3
//      Count: 4
//      Count: 5
//      Count: 6