package za.ac.cput.assignment1;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Barebone" );

        Scanner user_input = new Scanner(System.in);

        String first_name;
        System.out.println( "Whats your first name Barebone" );
        first_name = user_input.next();

        System.out.println( "Nice to meet you " + first_name + " Barebone" );

    }



}
