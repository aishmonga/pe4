import com.stackroute.pe4.MultipleOccurance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {

    MultipleOccurance multipleOccurance;

    @Before
    public void setUp() throws Exception {
        multipleOccurance = new MultipleOccurance();
    }

    @After
    public void tearDown() throws Exception {
        multipleOccurance = null;
    }

    @Test
    public void occurance1() {
        assertEquals("0 - 2 3 - 5" , multipleOccurance.occurance("se see she"));
    }

    @Test
    public void occurance2() {
        assertEquals("4 - 6" , multipleOccurance.occurance("hey sey"));
    }

    @Test
    public void occurance3() {
        assertEquals("4 - 6" , multipleOccurance.occurance("she sees"));
    }
}