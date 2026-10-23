import java.sql.SQLOutput;
import java.util.Scanner;

class Division
{
    String s1, s2;
    int a,b, ans;
    Scanner sc = new Scanner(System.in);

    void calculate()
    {
        try{
            System.out.println("Enter two numbers: ");
            s1 = sc.next();
            s2 = sc.next();
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            ans = a / b;
            System.out.println(ans);
        }

        // Method 1 (Among both the methods first defined method will execute)
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero, is not possible!");
            System.out.println(e.getMessage()); // It is pre-defined by java
            return;
        }

        // Method 2 (To test 2nd method remove 1st method)
        catch (Exception e2) // Syntax: catch (Exception e)
        {
            System.out.println(e2.toString()); // To get more detailed message about
            return;
        }
    }
}

class Divide
{
    public static void main(String[] args)
    {
        Division obj1 = new Division();
        obj1.calculate();
    }
}