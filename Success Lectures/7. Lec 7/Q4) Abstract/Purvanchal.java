abstract class Kaleen // Abstract is Inheritance + Interface, but keyword used here is 'extends'.
{
    void mirzapur()
    {
        System.out.println("I am king of Mirzapur");
    }
    abstract void johnpur();
}

abstract class Munna extends Kaleen
{
    void johnpur()
    {
        System.out.println("I am King of Johnpur");
    }
    abstract void dholakpur();
}

class Junna extends Munna
{
    void dholakpur()
    {
        System.out.println("I am King of Dholakpur");
    }
}

class Purvanchal
{
    public static void main (String[] args)
    {
        Junna obj1 = new Junna();
        obj1.mirzapur();
        obj1.johnpur();
        obj1.dholakpur();
    }
}