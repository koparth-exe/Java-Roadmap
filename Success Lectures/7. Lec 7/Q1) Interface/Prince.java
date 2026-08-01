interface Sauteli
{
    void Cooking();
    void Cleaning();
}

class Cindrella implements Sauteli
{
    public void Cooking()
    {
        System.out.println("I will prepare Italian");
    }
    public void Cleaning()
    {
        System.out.println("I will clean entire House");
    }
}

class Umbrella implements Sauteli
{
    public void Cooking()
    {
        System.out.println("I will prepare Maggi");
    }
    public void Cleaning()
    {
        System.out.println("I will clean History");
    }
}

class Prince
{
    public static void main (String[] args)
    {
        Cindrella obj1 = new Cindrella();
        obj1.Cooking();
        obj1.Cleaning();

        Umbrella obj2 = new Umbrella();
        obj2.Cooking();
        obj2.Cleaning();
    }
}