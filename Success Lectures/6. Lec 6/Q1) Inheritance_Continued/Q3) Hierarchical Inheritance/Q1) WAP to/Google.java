import java.util.Scanner;

class Employee
{
    Scanner sc = new Scanner(System.in);
    String name, dept;
    double salary;

    Employee()
    {
        System.out.println("Enter Name, Dept, Salary: ");
        name = sc.next();
        dept = sc.next();
        salary = sc.nextDouble();
    }

    @Override
    void display()
    {
        System.out.println("Name: "+name+"\nDept: "+dept+"\nSalary: "+salary);
    }
}

class Manager extends Employee
{
    int id;
    Manager()
    {
        System.out.println("Enter ID and Bonus: ");
        id = sc.nextInt();
        salary = sc.nextInt();
    }

    @Override
    void display()
    {
        super.salary = super.salary + this.salary;
        super.display();
        System.out.println("ID is "+id);
    }
}

class Intern extends Employee
{
    double stipend;
    int months;
    Intern()
    {
        System.out.println("Enter Stipend and Month: ");
        stipend = sc.nextInt();
        months = sc.nextInt();
    }

    void display()
    {
        super.salary = stipend * months;
        super.display();
    }
}

class Google
{
    public  static void main(String[] args)
    {
        Manager obj1 = new Manager();
        obj1.display();

        Intern obj2 = new Intern();
        obj2.display();
    }
}