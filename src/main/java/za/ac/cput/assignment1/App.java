package za.ac.cput.assignment1;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Calculator");
        System.out.println(add(1, 5));
        System.out.println(subtract(12, 6));
    }

    public static int add(int a, int b){

        return a + b;

    }

    public static int subtract(int a, int b){

        return a - b;

    }
}
