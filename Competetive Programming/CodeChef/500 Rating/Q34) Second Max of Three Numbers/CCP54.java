//Second Max of Three Numbers
//Problem Statement
//Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
//
//        Input
//First line contains the number of triples, N.
//The next N lines which follow each have three space separated integers.
//Output
//For each of the N triples, output one new line which contains the second-maximum integer among the three.
//
//        Constraints
//1 ≤ N ≤ 6
//        1 ≤ every integer ≤ 10000
//The three integers in a single triplet are all distinct. That is, no two of them are equal.
//        Sample 1:
//Input
//        Output
//3
//        1 2 3
//        10 15 5
//        100 999 500
//        2
//        10
//        500

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP54
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i =1; i <= T; i++)
        {
            int set[] = new int[3];
            int max1, max2 = 0;
            for (int j = 0; j <= 2; j++)
            {
                set[j] = sc.nextInt();
            }
            Arrays.sort(set);
            System.out.println(set[1]);
        }
    }
}
