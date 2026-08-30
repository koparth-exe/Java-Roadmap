//

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;


class CCP11
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // write your code here
        int ans = a + b + a*b;
        if (ans == 111)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
