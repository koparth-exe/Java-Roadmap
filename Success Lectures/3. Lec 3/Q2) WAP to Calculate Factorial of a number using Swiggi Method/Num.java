import java.util.Scanner;
class Fact
{
    int n, fact;
    void input(int x)
    {
        n = x;
    }
    void fact()
    {
        fact = 1;
        for(int i = 1;i<=n;i++)
        {
            fact = fact * i;     // |
            System.out.print(i); // | => Optional to print the sequence 1 x 2 x 3 x....
            if (i != n)          // |
            {
                System.out.print(" x ");
            }
        }
        System.out.println("\nFactorial is "+fact);
    }
}
class num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Fact obj1 = new Fact();
        System.out.println("Enter a number: "); // User Input was optional
        obj1.input(sc.nextInt());
        obj1.fact();
    }
}