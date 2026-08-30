//

// Code:
import java.util.Scanner;

class CCP13
{
    public static void main(String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int facto = 1;
        while (i <= n)
        {
            facto = i * facto;
            i++;
        }
        System.out.println(facto);

    }
}