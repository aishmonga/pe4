import com.stackroute.pe4.Occurance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceTest {

    Occurance occurance;

    @Before
    public void setUp() throws Exception {

        occurance = new Occurance();

    }

    @After
    public void tearDown() throws Exception {

        occurance = null;

    }

    @Test
    public void occuranceFunc1() {

        assertEquals(2, occurance.occuranceFunc("aish anku" , 'a'));

    }
    @Test
    public void occuranceFunc2() {

        assertEquals(0, occurance.occuranceFunc("aish anku" , 'b'));

    }
    @Test
    public void occuranceFunc3() {

        assertEquals(1, occurance.occuranceFunc("aish 1 anku" , '1'));

    }
}





