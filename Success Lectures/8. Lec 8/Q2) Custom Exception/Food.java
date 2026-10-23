import java.sql.SQLOutput;

class ManasException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Meri Marzi!";
    }
    @Override
    public String toString() {
        return "ManasException: Manas detected 10m away! Abort Mission!";
    }
}

class Dominoes
{
    String[] arr = {"Soham", "Manas", "Rohan"};
    void Invite()
    {
        for (String ditto:arr) {
            try {
                if (ditto.equals("Manas")) {
                    throw new ManasException();
                }
                System.out.println("Invitation sent to " + ditto);
            }
            catch (ManasException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}

class Food
{
    public static  void main(String[] args)
    {
        Dominoes obj1 = new Dominoes();
        obj1.Invite();
    }
}