import java.sql.SQLOutput;
import java.util.Scanner;

class Division1
{
    int a,b, ans;
    Scanner sc = new Scanner(System.in);

    void calculate()
    {
        try{
            System.out.println("Enter two numbers: ");
            a =  sc.nextInt();
            b =  sc.nextInt();
            ans = a / b;
            System.out.println(ans);
        }

        // Method 1 (Among both the methods first defined method will execute)
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage()); // It is pre-defined by java
            return;
        }
        finally {
            System.out.println("Have a nice day!");
        }
    }
}

class Finally
{
    public static void main(String[] args)
    {
        Division1 obj1 = new Division1();
        obj1.calculate();
    }
}