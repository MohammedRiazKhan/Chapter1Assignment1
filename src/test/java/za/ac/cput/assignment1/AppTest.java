package za.ac.cput.assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class AppTest 
{
    @Test
    public void add()
    {
        int expected = App.add(1, 5);
        assertEquals(expected, 6);//will pass
    }

    @Test
    public void subtract()
    {
        int expected = App.subtract(12, 6);
        assertEquals(expected, 6);//will pass
    }

}
