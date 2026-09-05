//404 Not Found
//Chef's website has a specific response mechanism based on the HTTP status code received:
//
//If the response code is
//404
//        404, the website will return NOT FOUND.
//For any other response code different from
//404
//        404, the website will return FOUND.
//Given the response code as
//        X
//X, determine the website response.
//
//Input Format
//The first and only line of input contains a response code
//        X
//X.
//        Output Format
//Output on a new line NOT FOUND, if the response code is
//404
//        404. Otherwise print FOUND.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings FOUND, fouND, FouND, and found will all be treated as identical).
//
//Constraints
//100
//        ≤
//X
//≤
//        999
//        100≤X≤999
//Sample 1:
//Input
//        Output
//200
//FOUND
//Explanation:
//Since the response code is not
//404
//        404, website returns FOUND.
//
//        Sample 2:
//Input
//        Output
//404
//NOT FOUND
//Explanation:
//Since the response code is
//404
//        404, website returns NOT FOUND.
//
//Sample 3:
//Input
//        Output
//301
//FOUND
//Explanation:
//Since the response code is not
//404
//        404, website returns FOUND.

// Code:
import java.util.*;
import java.lang.*;
import java.io.*;

class CCP27
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 404)
        {
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
    }
}