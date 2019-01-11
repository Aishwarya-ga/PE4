package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {
    ReplaceAll replaceAll;
    @Before
    public void setUp() throws Exception {
        replaceAll = new ReplaceAll();
    }

    @After
    public void tearDown() throws Exception {
        replaceAll = null;
    }

    @Test
    public void replaceAllWithOtherSuccess() {
        String expected = "faity fry";
        String actual = replaceAll.replaceAllWithOther("daily dry");
        assertEquals(expected,actual);
    }

    @Test
    public void replaceAllWithOtherFailure() {
        String expected = null;
        String actual = replaceAll.replaceAllWithOther(" ");
        assertEquals(expected,actual);
    }

    @Test
    public void replaceAllWithOtherInvalidInput() {
        String expected = null;
        String actual = replaceAll.replaceAllWithOther("1234");
        assertNotEquals(expected,actual);
    }
}