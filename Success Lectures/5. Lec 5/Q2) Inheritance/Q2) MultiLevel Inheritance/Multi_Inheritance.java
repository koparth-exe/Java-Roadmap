class Grandparent
{
    Grandparent()
    {
        System.out.println("I live in Jhopdi");
    }
}
class parent extends Grandparent
{
    parent()
    {
        System.out.println("I live in 2 BHK Flat");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("I live in Antilia");
    }
}

class Multi_Inheritance
{
    public static void main(String[] args)
    {
        child obj1 = new child();
    }
}