import java.util.*;
class Q2Unequal_Shuffle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++)
        {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            int A_a = 0;
            int A_b = 0;
            int B_a = 0;
            int B_b = 0;

            char[] a1 = A.toCharArray();
            char[] b1 = B.toCharArray();

            for (int j = 0; j <= a1.length - 1; j++)
            {
                if (a1[j] == 'a')
                {
                    A_a++;
                }
                else if (a1[j] == 'b')
                {
                    A_b++;
                }

                if (b1[j] == 'a')
                {
                    B_a++;
                }
                else if (b1[j] == 'b')
                {
                    B_b++;
                }
            }

            if (A_a == B_b)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
