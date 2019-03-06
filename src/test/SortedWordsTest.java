import com.stackroute.pe4.SortedWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortedWordsTest {

    SortedWords sortedWords ;

    @Before
    public void setUp() throws Exception {
        sortedWords = new SortedWords();
    }

    @After
    public void tearDown() throws Exception {
        sortedWords = null;
    }

    @Test
    public void sortFunc1() {
        List<String> li = new ArrayList<String>();
            li.add("aish");
            li.add("boom");

        assertEquals(li, sortedWords.SortFunc("boom aish"));
    }
    @Test
    public void sortFunc2() {
        List<String> li = new ArrayList<String>();
        li.add("aish");
        li.add("is");
        li.add("my");
        li.add("name");

        assertEquals(li, sortedWords.SortFunc("my name is aish"));
    }
    @Test
    public void sortFunc3() {
        List<String> li = new ArrayList<String>();
        li.add("ab");
        li.add("ab");
        li.add("bc");

        assertEquals(li, sortedWords.SortFunc("bc ab ab"));
    }
}