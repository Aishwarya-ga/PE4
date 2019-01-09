package com.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementOfRegexTest {
    ImplementOfRegex implementOfRegex;
    @Before
    public void setUp() throws Exception {
        implementOfRegex = new ImplementOfRegex();
    }

    @After
    public void tearDown() throws Exception {
        implementOfRegex = null;
    }

    @Test
    public void toFindSubStringUsingRegexSuccess() {
        boolean expected = true;
        //Act
        boolean actaul = implementOfRegex.toFindSubStringUsingRegex("This is Harry");
        //assert
        assertEquals(expected,actaul);
    }

    @Test
    public void toFindSubStringUsingRegexFailure() {
        boolean expected = false;
        //Act
        boolean actaul = implementOfRegex.toFindSubStringUsingRegex("This is Henry");
        //assert
        assertEquals(expected,actaul);
    }

    @Test
    public void toFindSubStringUsingRegexInvalidInput() {
        boolean expected = false;
        //Act
        boolean actaul = implementOfRegex.toFindSubStringUsingRegex(" ");
        //assert
        assertEquals(expected,actaul);
    }


}