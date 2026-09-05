//Donation Drive
//A blood drive aims to collect
//N
//N number of blood donations.
//The drive has collected
//X
//X donations so far. Find the remaining number of donations needed to reach the target.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case contains two space-separated integers
//N
//N and
//X
//X — the number of required donations and the number of collected donations, respectively.
//        Output Format
//For each test case, output on a new line, the remaining number of donations needed to reach the target.
//
//Constraints
//1
//        ≤
//T
//≤
//        200
//        1≤T≤200
//        1
//        ≤
//X
//≤
//N
//≤
//        20
//        1≤X≤N≤20
//Sample 1:
//Input
//        Output
//4
//        5 2
//        3 3
//        5 4
//        7 5
//        3
//        0
//        1
//        2
//Explanation:
//Test case
//        1
//        1: The drive aims to collect
//5
//        5 donations and has collected
//2
//        2 already. Thus, they need to collect
//3
//        3 more donations to reach the target.
//
//Test case
//        2
//        2: The drive aims to collect
//3
//        3 donations and has collected
//3
//        3 already. Thus, they need to collect no more donations to reach the target.
//
//        Test case
//        3
//        3: The drive aims to collect
//5
//        5 donations and has collected
//4
//        4 already. Thus, they need to collect
//1
//        1 more donation to reach the target.
//
//Test case
//        4
//        4: The drive aims to collect
//7
//        7 donations and has collected
//5
//        5 already. Thus, they need to collect
//2
//        2 more donations to reach the target.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP29
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int i = 1;
        while (i <= T)
        {
            int N = sc.nextInt();
            int X = sc.nextInt();
            System.out.println(N - X);
            i++;
        }

    }
}
