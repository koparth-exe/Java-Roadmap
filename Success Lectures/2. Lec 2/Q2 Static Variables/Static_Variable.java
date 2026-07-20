class Addition1
{
    static int a, b, sum;
    static void sum()
    {
        sum = a + b;
        System.out.println("Sum is "+sum);
    }
    static void greet()
    {
        System.out.println("Have a nice day!");
    }
}
class Static_Variable
{
    public static void main(String[] args)
    {
        Addition1.a = 10;
        Addition1.b = 20;
        Addition1.sum();
        Addition1.greet();

        Addition1.a = 30;
        Addition1.b = 40;
        Addition1.sum();
        Addition1.greet();
        System.out.println("Addition is "+Addition1.sum);
    }
}