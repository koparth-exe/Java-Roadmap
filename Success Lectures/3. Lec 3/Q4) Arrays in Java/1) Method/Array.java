import java.util.Scanner;

class Fill
{
    Scanner sc = new Scanner(System.in);
    int [] a = new int[5];
    void input()
    {
        for(int i = 0;i < 5;i++)
        {
            System.out.println("Enter number: ");
            a[i] = sc.nextInt();
        }
        display();
    }
    void display()
    {
        for(int i = 0;i < 5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

class Array
{
    public static void main(String[] args)
    {
        Fill obj1 = new Fill();
        obj1.input();
    }
}