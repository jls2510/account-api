import com.scratch.Tmail;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TmailTest {

    private String goodEmailAddress = "controller@ping23.com";
    private String badEmailAddress = "controller@bozocom";

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
        assertTrue(Tmail.emailAddressIsValid("controller@ping23.com"));
        assertFalse(Tmail.emailAddressIsValid("controller@bozocom"));
    }
}