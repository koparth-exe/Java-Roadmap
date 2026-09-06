//Right There
//If you wanna party, if you, if you wanna party
//Then put your hands up
//
//Chef wants to host a party with a total of
//N
//N people.
//However, the party hall has a capacity of
//        X
//X people. Find whether Chef can host the party.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of two space-separated integers
//N
//N and
//X
//X — the total number of people and the capacity of the party hall.
//Output Format
//For each test case, output on a new line, YES, if Chef can host the party and NO otherwise.
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
//N
//,
//X
//≤
//        10
//        1≤N,X≤10
//Sample 1:
//Input
//        Output
//4
//        2 5
//        4 3
//        6 6
//        10 9
//YES
//        NO
//YES
//        NO
//Explanation:
//Test case
//        1
//        1: Chef wants to host a party with
//2
//        2 people. Since the capacity of the hall is
//5
//        5, he can host the party.
//
//        Test case
//        2
//        2: Chef wants to host a party with
//4
//        4 people. Since the capacity of the hall is
//3
//        3, he can not host the party.
//
//Test case
//        3
//        3: Chef wants to host a party with
//6
//        6 people. Since the capacity of the hall is
//6
//        6, he can host the party.
//
//        Test case
//        4
//        4: Chef wants to host a party with
//10
//        10 people. Since the capacity of the hall is
//9
//        9, he can not host the party.

// Code:
import java.util.*;
import java.lang.*;

class CCP53
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

            if (N <= X)
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
