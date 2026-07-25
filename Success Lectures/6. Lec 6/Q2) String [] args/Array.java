class Array
{
    public static void main(String [] args)
    {
        for (String ditto:args)
        {
            System.out.println(ditto);
        }

        for (String ditto:args)
        {
            System.out.print(ditto+" ");
        }
    }
}

// In cmd,
// javac Array.java
// java Array Hello how are you