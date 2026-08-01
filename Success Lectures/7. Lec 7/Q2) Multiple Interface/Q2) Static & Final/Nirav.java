interface Majnu
{
    int ballons = 100;
    void punishment();
}

interface Uday
{
    int ballons = 200;
    void punishment();
}

class Om implements Majnu, Uday
{
    public void punishment()
    {
        for (int i = 0; i < Uday.ballons; i++)
        {
            System.out.println("Ballon number "+(i + 1));
        }
    }
}

class Nirav
{
    public static void  main (String[] args)
    {
        Om obj1 = new Om();
        obj1.punishment();
    }
}