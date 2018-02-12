import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class DriverTest {

    Driver james = new Driver("James",234);

    @Test
    public void testGetDriverNumPass() throws Exception {
        assertEquals(234,james.getDriverNum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDriverNumFail() throws Exception {
       Driver harry = new Driver("Harry",34);
       assertEquals(34,harry.getDriverNum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetDriverNameFail() throws Exception {
        Driver unknown = new Driver("",4756);
       assertEquals("",unknown.getDriverName());
    }

    @Test
    public void testGetDriverName() throws Exception {
        assertEquals("James",james.getDriverName());

    }

    @Test
    public void testtoString() throws Exception {
        assertEquals("\nDriver Name: James\nDriver Number: 234",james.toString());
    }

    @Test
    public void testCheck_Status() throws Exception {
        assertFalse(james.check_status());
    }

    @Test(timeout = 100)
    public void testWaitTillbanned() throws Exception {
        james.waitTillbanned();
    }



}