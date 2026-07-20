import java.util.Scanner;
class Best
{
    String dahihandi;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.println("Enter a String: ");
        dahihandi = sc.next();
    }

    void celebrate()
    {
        System.out.println("Everyone will enjoy "+dahihandi);
    }
}

class Method3
{
    public static void main(String[] args)
    {
        Best obj1 = new Best();
        obj1.input();;
        obj1.celebrate();
    }
}