class Template
{
    String name;
    int std, roll;
}

class name
{
    public static void main (String[] args)
    {
        Template myCopy = new Template();
        myCopy.name = "Parth";
        myCopy.std = 10;
        myCopy.roll = 22;

        System.out.println(myCopy.name);
        System.out.println(myCopy.std);
        System.out.println(myCopy.roll);

        Template hisCopy = new Template();
        hisCopy.name = "Soham";
        hisCopy.std = 10;
        hisCopy.roll = 22;

        System.out.println(hisCopy.name);
        System.out.println(hisCopy.std);
        System.out.println(hisCopy.roll);
    }
}