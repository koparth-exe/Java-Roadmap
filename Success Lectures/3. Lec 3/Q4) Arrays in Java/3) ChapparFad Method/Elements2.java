class Array2
{
    int[] a;
}

class Elements2
{
    public static void main(String[] args)
    {
        Array2 obj1 = new Array2();
        obj1.a= new int[5];

        for(int i = 0;i < 5;i++)
        {
            obj1.a[1] = 5;
        }
        for(int i = 0;i < 5;i++)
        {
            System.out.println(" ");
        }
    }

}