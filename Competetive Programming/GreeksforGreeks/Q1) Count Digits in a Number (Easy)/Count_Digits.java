//Given a number n, return the count of digits in this number.
//
//        Examples :
//
//        Input: n = 1567
//        Output: 4
//        Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.
//        Input: n = 99999
//        Output: 5
//        Explanation: Number of digit in 99999 is 5
//        Constraints:
//        1 ≤ n ≤ 109

import java.util.Scanner;
class Solution1 {
    public static int countDigits(int n)
    {
        // Code here
        int count = 0;
        if (n == 0)
        {
            return 1;
        }
        else{
            while (n != 0)
            {
                n = n / 10;
                count++;
            }
            return count;
        }

    }
}

class Count_Digit
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Solution1 obj1 = new Solution1();
        int num = sc.nextInt();
        System.out.print(obj1.countDigits(num));
    }
}

//Problem Solved Successfully
//Suggest Feedback
//Test Cases Passed
//1116 / 1116
//Attempts : Correct / Total
//1 / 1
//Accuracy :
//        100%
//Points Scored
//2 / 2
//Your Total Score:
//        2
//Time Taken
//0.12