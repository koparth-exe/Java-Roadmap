//Masterchef finals
//Chef has been working hard to compete in MasterChef.
//He is ranked
//        X
//X out of all contestants. However, only
//10
//        10 contestants would be selected for the finals.
//
//Check whether Chef made it to the top
//10
//        10 or not?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of one integers
//X
//X — the current rank of Chef.
//        Output Format
//For each test case, output on a new line, YES, if Chef made it to the top
//10
//        10 and NO otherwise.
//
//Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//X
//≤
//        100
//        1≤X≤100
//Sample 1:
//Input
//        Output
//4
//        15
//        10
//        1
//        50
//NO
//        YES
//YES
//        NO
//Explanation:
//Test case
//        1
//        1: Chef's rank is
//        15
//        15 which is greater than
//10
//        10. Thus, Chef did not make it to the top
//10
//        10.
//
//Test case
//        2
//        2: Chef's rank is
//        10
//        10 which is equal to
//10
//        10. Thus, Chef made it to the top
//10
//        10.
//
//Test case
//        3
//        3: Chef made it to the top
//10
//        10, as his rank is
//1
//        1.
//
//Test case
//        4
//        4: Chef did not make it to the top
//10
//        10 as his rank is
//50
//        50.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP22
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
            if (X <= 10)
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
