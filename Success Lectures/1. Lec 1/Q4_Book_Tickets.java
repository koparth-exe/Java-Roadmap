class Ticket
{
    String from, to;
    void print_ticket()
    {
        System.out.println("Your ticket is from " +from+ " to " +to); // Option-1
        System.out.printf("Your ticket is from %s to %s\n", from, to); // Option-2
    }
}

class Booking
{
    public static void main(String[] args)
    {
        Ticket obj1 = new Ticket();
        obj1.from = "Domblvli";
        obj1.to = "Airoli";
        obj1.print_ticket();

        Ticket obj2 = new Ticket();
        obj2.from = "Dombivli";
        obj2.to = "Ghansoli";
        obj2.print_ticket();
    }
}