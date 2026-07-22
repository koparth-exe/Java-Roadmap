class Parent
{
    int a, b, ans;
    void add()
    {
        ans = a + b;
        System.out.println("Sum = " + ans);
    }
}
class Child extends Parent
{
    int avg;
    void average()
    {
        avg = ans / 2;
        System.out.println("Average = "+avg);
    }
}

class Inheritance
{
    public static void main(String[] args)
    {
        Child obj1 = new Child();
        obj1.a = 10;
        obj1.b = 20;
        obj1.add();
        obj1.average();
    }
}