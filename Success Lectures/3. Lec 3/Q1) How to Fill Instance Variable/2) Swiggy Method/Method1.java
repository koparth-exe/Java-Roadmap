class Swiggy
{
    String dahihandi;
    void Input(String swiggy)
    {
        dahihandi = swiggy;
    }
    void Celebrate()
    {
        System.out.println("Everyone will enjoy "+dahihandi);
    }
}

class Method1
{
    public static void main(String[] args)
    {
        Swiggy obj1 = new Swiggy();
        obj1.Input("Dahi");
        obj1.Celebrate();
    }
}