import com.stackroute.pe4.RegEx;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegExTest {

    RegEx regEx ;

    @Before
    public void setUp() throws Exception {
        regEx = new RegEx();
    }

    @After
    public void tearDown() throws Exception {
        regEx = null;
    }

    @Test
    public void regexFunc1() {
        assertEquals("Is Harry here ? true" , regEx.regexFunc("Harry potter."));
    }

    @Test
    public void regexFunc2() {
        assertEquals("Is Harry here ? true" , regEx.regexFunc("Harrypotter."));
    }

    @Test
    public void regexFunc3() {
        assertEquals("Is Harry here ? false" , regEx.regexFunc("Hurry up!!."));
    }

}