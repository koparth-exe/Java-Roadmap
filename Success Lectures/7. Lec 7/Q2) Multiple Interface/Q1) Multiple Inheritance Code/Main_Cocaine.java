interface MU
{
    void Maths();
}
interface PU
{
    void Maths();
}

class Cocaine implements MU, PU
{
    public void Maths()
    {
        System.out.println("I will teach mental Abacus");
    }
}

class Main_Cocaine
{
    public static void main (String[] args)
    {
        Cocaine obj1 = new Cocaine();
        obj1.Maths();
    }
}