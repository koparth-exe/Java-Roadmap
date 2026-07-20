//Q1 WAP TO add two numbers and greet user with Have a good day
class Addition
{
    int a, b , sum;
    void add()
    {
        sum = a + b;
        System.out.println("Sum is "+sum);
    }
    static void greet()
    {
        System.out.println("Have a good Day!");
    }
}
class Lec2_Q1
{
    public static void main(String[] args)
    {
        Addition obj1 = new Addition();
        obj1.a = 10;
        obj1.b = 20;
        obj1.add();
        Addition.greet();

        Addition obj2 = new Addition();
        obj2.a = 20;
        obj2.b = 30;
        obj2.add();
        Addition.greet();
    }
}