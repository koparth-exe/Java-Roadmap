import java.util.Scanner;
class India_Aadhaar
{
    String name, location;
    int age;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.println("Enter your name, location, age: ");
        name = sc.next();
        location = sc.next();
        age = sc.nextInt();
    }
    void display()
    {
        System.out.println("Name: "+name+"\nLocation: "+location+"\nAge: "+age);
    }
}
class Parth extends India_Aadhaar
{
    String insta_id;
    @Override
    void input()
    {
        super.input();
        System.out.println("Enter your Instagram ID: ");
        insta_id = sc.next();
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Insta ID: "+insta_id);
    }
}

class Prime_Minister
{
    public static void main(String[] args)
    {
        Parth obj1 = new Parth();
        obj1.input();
        obj1.display();
    }
}
