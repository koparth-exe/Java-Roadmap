//

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP21
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int i = 1;
        while (i <= T)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > Y)
            {
                System.out.println(X - Y);
            }
            i++;
        }
    }
}
