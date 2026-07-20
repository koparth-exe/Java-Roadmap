import java.util.Scanner;

class Sum
{
    int n, temp, ans;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter a number: ");
        n = sc.nextInt();
    }
    void calculate()
    {
        ans = 0;
        while (n > 0)
        {
            temp = n % 10;
            System.out.print(temp); // | => Optional to print the sequence 1 + 2 + 3 +....
            if (temp != n)          // |
            {
                System.out.print(" + ");
            }
            ans = ans + temp;
            n = n / 10;
        }
        System.out.println("\nSum is "+ans);
    }
}
class Num2
{
    public static void main(String[] args)
    {
        Sum obj1 = new Sum();
        obj1.input();
        obj1.calculate();
    }
}