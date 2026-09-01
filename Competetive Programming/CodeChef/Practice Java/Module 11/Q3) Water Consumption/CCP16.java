import java.util.*;
import java.lang.*;
import java.io.*;


class CCP16
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(i <= t)
        {
            int x = sc.nextInt();
            // write your code here
            if (x >= 2000){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            i++;
        }

    }
}
