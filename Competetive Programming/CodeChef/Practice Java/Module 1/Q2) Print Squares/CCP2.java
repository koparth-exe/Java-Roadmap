//Print Squares
//Write a program to output the squares (using multiplication) of numbers from 1 to 5 on separate lines.
//
//        Sample 1:
//Input
//        Output
//
//1 - 1
//        2 - 4
//        3 - 9
//        4 - 16
//        5 - 25
// Code:

class CCP2
{
    public static void main(String[] args)
    {
        // your code goes here
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i + " - " + i * i);
        }
    }
}