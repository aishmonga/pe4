import com.stackroute.pe4.ReplaceChars;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharsTest {

    ReplaceChars replaceChars;


    @Before
    public void setUp() throws Exception {
        replaceChars = new ReplaceChars();
    }

    @After
    public void tearDown() throws Exception {
        replaceChars = null;
    }

    @Test
    public void replaceCharfunc1() {
        assertEquals("faity" , replaceChars.replaceCharfunc("daily"));
    }
    @Test
    public void replaceCharfunc2() {
        assertEquals("fo" , replaceChars.replaceCharfunc("do"));
    }
    @Test
    public void replaceCharfunc3() {
        assertEquals("fett" , replaceChars.replaceCharfunc("dell"));
    }
}