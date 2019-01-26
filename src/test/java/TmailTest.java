import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TmailTest {

    private String goodEmailAddress = "jim@ping23.com";
    private String badEmailAddress = "jim@bozocom";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCanCreateFromGoodEmailAddress() {
        try {
            Tmail tMail = Tmail.fromString(goodEmailAddress);
            assertTrue(tMail instanceof Tmail);
        } catch (Exception exception) {
            fail();
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCannotCreateFromBadEmailAddress() {
            Tmail tMail = Tmail.fromString(badEmailAddress);
    }

    @Test
    public void testToString() {
        try {
            Tmail tMail = new Tmail(goodEmailAddress);
            assertEquals(goodEmailAddress, tMail.toString());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void emailAddressIsValid() {
        assertTrue(Tmail.emailAddressIsValid("jim@ping23.com"));
        assertFalse(Tmail.emailAddressIsValid("jim@bozocom"));
    }
}