package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ToFindMultipleOccurenceOfWordTest {
    ToFindMultipleOccurenceOfWord toFindMultipleOccurenceOfWord;
    @Before
    public void setUp() throws Exception {
        toFindMultipleOccurenceOfWord = new ToFindMultipleOccurenceOfWord();
    }

    @After
    public void tearDown() throws Exception {
        toFindMultipleOccurenceOfWord = null;
    }
    /* method to test success */
    @Test
    public void toFindMultipleOccurenceSuccess() {
        List<String> expected = new ArrayList<>();
                expected.add("Found at 4-6");
                expected.add("Found at 10-12");
                expected.add("Found at 27-29");
                List<String> actual = toFindMultipleOccurenceOfWord.toFindMultipleOccurence("She sells seashells by the seashore","se");
                assertEquals(expected,actual);
    }
    /* method to test failure */
    @Test
    public void toFindMultipleOccurenceFailure() {
        List<String> expected = null;
        List<String> actual = toFindMultipleOccurenceOfWord.toFindMultipleOccurence(" ","se");
        assertEquals(expected,actual);
    }
}