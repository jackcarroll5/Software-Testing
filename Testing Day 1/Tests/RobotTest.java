import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;



public class RobotTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    @Before//Setup
       public void RobotSetup() throws Exception//Done before every single test. Robot created for every single test.
    {
        soap = new Robot("Soap");//Useful for every static member needing to reset
    }

    Robot soap = new Robot("Soap");

    @Test
    public void testGetWorkingMessage() throws Exception {

        soap.talkToRobot();
        assertEquals(soap.getWorkMessage(),"I am working");//Ensure the testing message works.
    }

    @Test(expected = IllegalStateException.class)
    public void testGetWorkingMessageFail() throws Exception {


        assertEquals(soap.getWorkMessage(),"I am working");//Expect exception
    }

    @Test
    public void testNotWorking() throws Exception {
        assertFalse(soap.isWorking());//Check that test is false

    }

    @Test
    public void testWorks() throws Exception {
    soap.talkToRobot();

    assertTrue(soap.isWorking());//Check that robot is working and is true.

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConFail() throws Exception { //Throw away illegal argument exception. Test Fails
      Robot william = new Robot("");

      assertEquals("Soap",william.getName());
    }

    @Test
    public void testRobotCon() throws Exception {
       assertEquals("Soap",soap.getName());//Check if expected result and actual result are the same . Test will pass if match present
    }

    @Test(timeout = 100)//In milliseconds to stop infinite loop
    public void testWaitUntilWorking() throws Exception {
        soap.waitUntilWorking();

    }
}