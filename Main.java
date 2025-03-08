import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        do
        {
            System.out.print("Enter a Number (0,1): ");
            num=sc.nextInt();         
            if(num==1)
            {
                System.out.print("Enter Your Marks: ");
                double marks=sc.nextDouble();
                if(marks>=90)
                {
                    System.out.println("This is Good");
                }
                else if(marks>=60 && marks<=89)
                {
                    System.out.println("This is also Good");
                }
                else if(marks>=0 && marks<=59)
                {
                    System.out.println("This is Good as Well");
                }
                else if(num==0)
                {
                    break;
                }
            }
        }while(num!=0);
        sc.close();
    }
}