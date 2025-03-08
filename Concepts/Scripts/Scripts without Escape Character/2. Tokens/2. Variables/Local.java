public class Local
{
    void display()
    {
        int a=10,b=5;
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    public static void main(String[] args)
    {
        Local obj=new Local();
        int sum=50;
        System.out.println("Main Sum: "+sum);
        obj.display();
        System.out.println("Main Sum: "+sum);
        obj.display();
    }
}

// O/p: Main Sum: 50
//      Sum: 15
//      Main Sum: 50
//      Sum: 15