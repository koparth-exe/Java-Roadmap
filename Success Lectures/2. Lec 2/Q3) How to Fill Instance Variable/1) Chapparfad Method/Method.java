class Chapparfad
{
    String dahihandi;
    void Celebrate()
    {
        System.out.println("Everyone will enjoy "+dahihandi);
    }
}

class Method
{
    public static void main(String[] args)
    {
        Chapparfad obj1 = new Chapparfad();
        obj1.dahihandi = "Dahi";
        obj1.Celebrate();
    }
}