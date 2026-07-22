class Twitter
{
    String name = "Twitter";
}
class Elon extends Twitter
{
    String name = "X";
    void announce()
    {
        System.out.println("I am Owner of "+this.name);
        System.out.println("Previous Owner was "+super.name);
    }
}

class Elon_Musk
{
    public static void main(String[] args)
    {
        Elon obj1 = new Elon();
        obj1.announce();
    }
}