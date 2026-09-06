//2000
//Chef had collected
//        N
//N notes of Rs.
//        2000
//        2000 to pay his total college fees. However, the government banned Rs.
//        2000
//        2000 notes.
//
//Chef wants to pay the same amount using Rs.
//500
//        500 notes only. Find the number of notes Chef needs.
//
//        Input Format
//Each test case consists of a single integer
//        N
//N - the number of notes of Rs.
//        2000
//        2000 that Chef has collected.
//
//Output Format
//Output a single integer - the number of Rs.
//        500
//        500 notes needed.
//
//Constraints
//1
//        ≤
//N
//≤
//        100
//        1≤N≤100
//Sample 1:
//Input
//        Output
//4
//        16
//Explanation:
//        4
//        4 notes of Rs.
//2000
//        2000 make a total of
//4
//        ⋅
//        2000
//        =
//        8000
//        4⋅2000=8000 rupees. This is equivalent to
//16
//        16 notes of Rs.
//500
//        500.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP43
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println((N * 2000) / 500);

    }
}
