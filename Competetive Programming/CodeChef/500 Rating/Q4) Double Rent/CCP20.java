//Double Rent
//Chefina decided to move into Chef's apartment.
//Chef was initially paying a rent of
//        X
//X rupees. Since Chefina is moving in, the owner decided to double the rent.
//
//Find the final rent Chef needs to pay.
//
//        Input Format
//The input consists of a single integer
//        X
//X, denoting the rent Chef was initially paying.
//
//        Output Format
//Output on a new line, the final rent Chef needs to pay.
//
//        Constraints
//1
//        ≤
//X
//≤
//        10
//        1≤X≤10
//Sample 1:
//Input
//        Output
//2
//        4
//Explanation:
//Chef was initially paying
//2
//        2 rupees. After Chefina moves in, he needs to pay
//2
//        ⋅
//        2
//        =
//        4
//        2⋅2=4 rupees.
//
//        Sample 2:
//Input
//        Output
//3
//        6
//Explanation:
//Chef was initially paying
//3
//        3 rupees. After Chefina moves in, he needs to pay
//2
//        ⋅
//        3
//        =
//        6
//        2⋅3=6 rupees.
//
//        Sample 3:
//Input
//        Output
//10
//        20
//Explanation:
//Chef was initially paying
//10
//        10 rupees. After Chefina moves in, he needs to pay
//2
//        ⋅
//        10
//        =
//        20
//        2⋅10=20 rupees.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        X = 2 * X;
        System.out.println(X);

    }
}
