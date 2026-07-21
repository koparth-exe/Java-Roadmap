import java.sql.SQLOutput;
import java.util.Scanner;

class Prime
{
    int n;
    Scanner sc = new Scanner(System.in);
    Prime()
    {
        System.out.println("Enter a number: ");
        n = sc.nextInt();
    }
    void calculate()
    {
        int i;
        for (i = 2; i <= n; i++)
        {
            if (n % i == 0)
            {
                break;
            }
        }
        if (i == n)
        {
            System.out.println(n+" is Prime");
        }
        else
        {
            System.out.println(n+" is Not Prime");
        }
    }
}

class Calculate
{
    public static void main(String[] args)
    {
        Prime obj1 = new Prime();
        obj1.calculate();
    }
}