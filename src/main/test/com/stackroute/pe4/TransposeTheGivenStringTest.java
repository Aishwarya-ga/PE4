package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTheGivenStringTest {
    TransposeTheGivenString transposeTheGivenString;
    @Before
    public void setUp() throws Exception {
        transposeTheGivenString = new TransposeTheGivenString();
    }

    @After
    public void tearDown() throws Exception {
        transposeTheGivenString = null;
    }
    /* method to test success */
    @Test
    public void toTransposeStringSuccess() {
        String expected ="a kciuq nworb xof spmuj revo eht yzal god" ;
        String actual = transposeTheGivenString.toTransposeString("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actual);
    }
    /* method to test failure */
    @Test
    public void toTransposeStringFailure() {
        String expected =null;
        String actual = transposeTheGivenString.toTransposeString(" ");
        assertEquals(expected,actual);
    }
}