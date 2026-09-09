//Lunchtime
//Chef has his lunch only between
//1
//        1 pm and
//4
//        4 pm (both inclusive).
//
//Given that the current time is
//X
//        X pm, find out whether it is lunchtime for Chef.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, the number of test cases. Then the test cases follow.
//Each test case contains a single line of input, containing one integer
//X
//X.
//        Output Format
//For each test case, print in a single line
//        YES
//YES if it is lunchtime for Chef. Otherwise, print
//        NO
//NO.
//
//You may print each character of the string in either uppercase or lowercase (for example, the strings
//YeS
//        YeS,
//                                                                             yEs
//                                                                                     yEs,
//                                                                             yes
//                                                                                     yes and
//                                                                                     YES
//                                                                                     YES will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        12
//        1≤T≤12
//        1
//        ≤
//X
//≤
//        12
//        1≤X≤12
//Sample 1:
//Input
//        Output
//3
//        1
//        7
//        3
//YES
//        NO
//YES
//Explanation:
//Test case
//        1
//        1: Lunchtime is between
//1
//        1 pm and
//4
//        4 pm (both inclusive). Since
//1
//        1 pm lies within lunchtime, the answer is
//YES
//YES.
//
//        Test case
//        2
//        2: Lunchtime is between
//1
//        1 pm and
//4
//        4 pm (both inclusive). Since
//7
//        7 pm lies outside lunchtime, the answer is
//NO
//NO.
//
//        Test case
//        3
//        3: Lunchtime is between
//1
//        1 pm and
//4
//        4 pm (both inclusive). Since
//3
//        3 pm lies within lunchtime, the answer is
//YES
//YES.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP75
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++)
        {
            int X = sc.nextInt();
            if (X >= 1 && X <= 4)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
