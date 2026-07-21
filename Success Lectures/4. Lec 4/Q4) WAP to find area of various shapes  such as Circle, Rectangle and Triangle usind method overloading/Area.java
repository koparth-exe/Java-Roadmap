import java.util.Scanner;
class Shapes
{
    double ans;
    void area(int r)
    {
        ans = Math.PI * r * r; //OR ans = 3.14 * r * r;
        System.out.println("Area of a circle = "+ans);
    }
    void area(int l, int b)

    {
        ans = l * b;
        System.out.println("Area of a Rectangle = "+ans);
    }
    void area(double b, double h)

    {
        ans = 0.5 * b * h;
        System.out.println("Area of a Triangle = "+ans);
    }
}

class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shapes obj1 = new Shapes();
        int ch = 0;
        do
        {
            System.out.println("Find Area of: ");
            System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter Radius of a circle: ");
                    int radius = sc.nextInt();
                    obj1.area(radius);
                    break;

                case 2:
                    System.out.println("Enter length and breadth: ");
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    obj1.area(length, breadth);
                    break;

                case 3:
                    System.out.println("Enter base and height: ");
                    double base = sc.nextInt();
                    double height = sc.nextInt();
                    obj1.area(base, height);
                    break;

                case 4:
                    System.out.println("Exited! Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }while (ch != 4);
    }
}