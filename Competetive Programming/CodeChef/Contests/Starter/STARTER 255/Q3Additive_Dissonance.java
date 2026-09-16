import java.util.*;

class Q3Additive_Dissonance
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int  i = 1; i <= T; i++)
        {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int j = 0; j <= N - 1; j++)
            {
                A[j] = sc.nextInt();
            }
            Arrays.sort(A);

            int freq = 1;
            int max_freq = 1;
            for (int j = 1; j <= N - 1;j++)
            {
                if (A[j] == A[j - 1])
                {
                    freq++;
                }
                else{
                    freq = 1;
                }
                if (freq > max_freq)
                {
                    max_freq = freq;
                }
            }
            System.out.println((max_freq + 1) / 2);

        }

    }
}
