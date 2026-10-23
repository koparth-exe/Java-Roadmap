import java.util.Scanner;

class Sum
{
    int n, sum;
    Scanner sc = new Scanner(System.in);
    Sum()
    {
        System.out.println("enter the number");
        n = sc.nextInt();
        sum = 0;
        while( n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println(sum);
    }
}

class Main
{
    public static void main(String args[])
    {
        Sum obj1  = new Sum();
    }
}