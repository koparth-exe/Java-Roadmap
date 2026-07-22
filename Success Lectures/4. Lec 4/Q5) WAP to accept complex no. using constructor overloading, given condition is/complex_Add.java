// Q5) WAP to accept complex no. using constructor overloading, given condition is:
// no. of args              real    imag
//      0                   r=0     i=0
//      1         x=5       r=5     i=5
//      2         x=5, x=2  r=5     i=2

class complex
{
    int r, i;
    complex()
    {
        r = 0;
        i = 0;
    }
    complex(int x)
    {
        r = x;
        i = x;
    }
    complex(int x, int y)
    {
        r = x;
        i = y;
    }
}

class complex_Add
{
    public static void main(String[] args)
    {
        complex obj1 = new complex(2);
        complex obj2 = new complex(5, 2);
        complex obj3 = new complex(obj1.r + obj2.r, obj1.i + obj2.i);
        System.out.println("Addition is: "+obj3.r+ "+i"+obj3.i);
    }
}