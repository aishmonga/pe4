import com.stackroute.pe4.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString = null;
    }

    @Test
    public void transposeFunc1() {
        assertEquals("cb ac ba" , transposeString.transposeFunc("bc ca ab"));
    }

    @Test
    public void transposeFunc2() {
        assertEquals("yeh oy" , transposeString.transposeFunc("hey yo"));
    }

    @Test
    public void transposeFunc3() {
        assertEquals("llew enod" , transposeString.transposeFunc("well done"));
    }
}