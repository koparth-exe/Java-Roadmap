import java.util.Scanner;
class Student
{
    String name;
    int std, roll;
}

class parth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student myCopy = new Student();

        System.out.println("Enter your Name, Std, Roll: ");
        myCopy.name = sc.next();
        myCopy.std = sc.nextInt();
        myCopy.roll = sc.nextInt();

        System.out.println(myCopy.name);
        System.out.println(myCopy.std);
        System.out.println(myCopy.roll);

        Template hisCopy = new Template();
        System.out.println("Enter your Name, Std, Roll: ");
        hisCopy.name = sc.next();
        hisCopy.std = sc.nextInt();
        hisCopy.roll = sc.nextInt();

        System.out.println(hisCopy.name);
        System.out.println(hisCopy.std);
        System.out.println(hisCopy.roll);
//      System.out.println(hisCopy); // To print Hexadecimal Hash code of hisCopy
    }
}