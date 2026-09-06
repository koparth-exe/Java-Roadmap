//Roller Coaster
//Chef's son wants to go on a roller coaster ride. The height of Chef's son is
//        X
//X inches while the minimum height required to go on the ride is
//H
//H inches. Determine whether he can go on the ride or not.
//
//Input Format
//The first line contains a single integer
//        T
//T - the number of test cases. Then the test cases follow.
//The first and only line of each test case contains two integers
//        X
//X and
//H
//H - the height of Chef's son and the minimum height required for the ride respectively.
//Output Format
//For each test case, output in a single line, YES if Chef's son can go on the ride. Otherwise, output NO.
//
//You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical)
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//X
//,
//H
//≤
//        100
//        1≤X,H≤100
//Sample 1:
//Input
//        Output
//4
//        15 20
//        50 48
//        32 32
//        38 39
//NO
//        YES
//YES
//        NO
//Explanation:
//Test case 1: Chef's son can not go on the ride as his height
//<
//< the minimum required height.
//
//        Test case 2: Chef's son can go on the ride as his height
//        ≥
//        ≥ the minimum required height.
//
//Test case 3: Chef's son can go on the ride as his height
//        ≥
//        ≥ the minimum required height.
//
//Test case 4: Chef's son can not go on the ride as his height
//<
//< the minimum required height.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP44
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
            int H = sc.nextInt();

            if (X >= H)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            i++;
        }

    }
}
