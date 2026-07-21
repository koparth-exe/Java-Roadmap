class KKR
{
    void Sunil(String ball)
    {
        System.out.println("I will practice balling today.");
    }
    void Sunil(String bat, String glows)
    {
        System.out.println("I will practice batting today.");
    }
    void Sunil()
    {
        System.out.println("I will practice fielding today.");
    }
}

class IPL
{
    public static void main(String[] args)
    {
        KKR obj1 = new KKR();
        obj1.Sunil("ball");
        obj1.Sunil("bat", "Glows");
        obj1.Sunil();

    }
}
