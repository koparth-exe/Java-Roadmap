//Airline Restrictions
//Chef has
//3
//        3 bags that she wants to take on a flight. They weigh
//        A
//                A,
//                B
//B, and
//        C
//C kgs respectively. She wants to check-in exactly two of these bags and carry the remaining one bag with her.
//
//The airline restrictions says that the total sum of the weights of the bags that are checked-in cannot exceed
//        D
//D kgs and the weight of the bag which is carried cannot exceed
//        E
//E kgs. Find if Chef can take all the three bags on the flight.
//
//Input Format
//The first line of the input contains a single integer
//T
//T denoting the number of test cases. The description of
//        T
//T test cases follows.
//Each testcase contains a single line of input, five space separated integers
//        A
//        ,
//        B
//        ,
//        C
//        ,
//        D
//        ,
//        E
//A,B,C,D,E.
//        Output Format
//For each testcase, output in a single line answer "YES" if Chef can take all the three bags with her or "NO" if she cannot.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        36000
//        1≤T≤36000
//        1
//        ≤
//A
//,
//B
//,
//C
//≤
//        10
//        1≤A,B,C≤10
//        15
//        ≤
//D
//≤
//        20
//        15≤D≤20
//        5
//        ≤
//E
//≤
//        10
//        5≤E≤10
//Subtasks
//Subtask #1 (100 points): original constraints
//
//Sample 1:
//Input
//        Output
//3
//        1 1 1 15 5
//        8 7 6 15 5
//        8 5 7 15 6
//YES
//        NO
//YES
//Explanation:
//Test case
//        1
//        1: Chef can check-in the first and second bag (since
//1
//        +
//        1
//        =
//        2
//        ≤
//        15
//        1+1=2≤15) and carry the third bag with her (since
//1
//        ≤
//        5
//        1≤5).
//
//Test case
//        2
//        2: None of the three bags can be carried in hand without violating the airport restrictions.
//
//        Test case
//        3
//        3: Chef can check-in the first and the third bag (since
//8
//        +
//        7
//        ≤
//        15
//        8+7≤15) and carry the second bag with her (since
//5
//        ≤
//        6
//        5≤6).

// Code:
import java.util.*;
import java.lang.*;

class CCP39
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int i = 1;
        while (i <= T)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();

            if (A + B <= D && C <= E || A + C <= D && B <= E || B + C <= D && A <= E)
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
