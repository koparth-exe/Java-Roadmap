import java.util.*;
import java.lang.*;
import java.io.*;

class CCP35
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (Y > X)
            {
                System.out.println("Profit");
            }
            else if(Y < X)
            {
                System.out.println("Loss");
            }
            else if (Y == X){
                System.out.println("Neutral");
            }
        }
    }
}
