package com.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsOfTextAlphabeticallyTest {
    SortWordsOfTextAlphabetically sortWordsOfTextAlphabetically;
    @Before
    public void setUp() throws Exception {
        sortWordsOfTextAlphabetically = new SortWordsOfTextAlphabetically();
    }

    @After
    public void tearDown() throws Exception {
        sortWordsOfTextAlphabetically = null;
    }

    @Test
    public void toSortAlphabeticalOrderSuccess() {
        String[] expected = {"a","brown","dog","fox","jumps","lazy","over","quick","the"};
        String[] actual = sortWordsOfTextAlphabetically.toSortAlphabeticalOrder("a quick brown fox jumps over the lazy dog");
        assertArrayEquals(expected,actual);
    }

    @Test
    public void toSortAlphabeticalOrderFailure() {
        String[] expected = null;
        String[] actual = sortWordsOfTextAlphabetically.toSortAlphabeticalOrder(" ");
        assertArrayEquals(expected,actual);
    }

    @Test
    public void toSortAlphabeticalOrderInvalidInput() {
        String[] expected = null;
        String[] actual = sortWordsOfTextAlphabetically.toSortAlphabeticalOrder("1324");
        assertNotEquals(expected,actual);
    }

}