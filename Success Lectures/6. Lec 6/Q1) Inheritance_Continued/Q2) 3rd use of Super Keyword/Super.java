class Red
{
    Red()
    {
        System.out.println("Red Zero");
    }
    Red(String S1)
    {
        System.out.println("Red One");
    }
}
class Blue extends Red
{
    Blue()
    { //super() is present in invisible
        super("2");
        System.out.println("Blue Zero");
    }
    Blue(String S1)
    { //super() is present in invisible
        super(S1);
        System.out.println("Blue One");
    }
}

class Super
{
    public static void main(String[] args)
    {
        Blue obj1 = new Blue();
    }
}