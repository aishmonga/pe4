import com.stackroute.pe4.StringBuilderUse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBuilderUseTest {

    StringBuilderUse stringBuilderUse;

    @Before
    public void setUp() throws Exception {
        stringBuilderUse = new StringBuilderUse();
    }

    @After
    public void tearDown() throws Exception {
        stringBuilderUse = null;
    }

    @Test
    public void StringBuilderUse1() {

        assertEquals("hsia si eman ym" , stringBuilderUse.stringBuilderFunc("my name is aish"));

    }
    @Test
    public void StringBuilderUse2() {

        assertEquals("kv ma kiv" , stringBuilderUse.stringBuilderFunc("vik am vk"));

    }
}