import java.util.*;

class Q1Buying_Eggs
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int F = sc.nextInt();

        if (X <= Y + F){
            System.out.println(12 * X);
        }
        else{
            System.out.println(12 * Y + F);
        }
    }
}
