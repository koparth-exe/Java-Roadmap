abstract class Kaleen
{
    void mirzapur()
    {
        System.out.println("I am king of Mirzaput");
    }
    abstract void johnpur();
}

abstract class Munna extends Kaleen
{
    void johnpur()
    {
        System.out.println("I am King ofJohnpur");
    }
    abstract void dholakpur();
}

class Junna extends Munna
{
    void dholakpur()
    {
        System.out.println("I am King ofDholakpur");
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