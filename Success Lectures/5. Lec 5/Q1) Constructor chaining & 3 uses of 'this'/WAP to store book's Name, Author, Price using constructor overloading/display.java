class Book
{
    String name, author;
    double price;
    Book (String name, String author, double price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.display();
    }
    void display()
    {
        System.out.println("Book name: "+name+"\nAuthor name: "+author+"\nPrice of this book: $"+price);
    }
    Book(String name, String author)
    {
        this(name, author, 200);
    }
    Book(String name)
    {
        this(name, "Unknown");
    }
}

class display
{
    public static void main(String[] args)
    {
        Book obj1 = new Book("Atomic Habits");
        System.out.print("\n");
        Book obj2 = new Book("Atomic Habits", "James Clear");
        System.out.print("\n");
        Book obj3 = new Book("Atomic Habits", "James Clear", 550);
    }
}