package com.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumOfOccurenceOfCharTest {
    CountNumOfOccurenceOfChar countNumOfOccurenceOfChar;
    @Before
    public void setUp() throws Exception {
        countNumOfOccurenceOfChar = new CountNumOfOccurenceOfChar();
    }

    @After
    public void tearDown() throws Exception {
        countNumOfOccurenceOfChar = null;
    }

    @Test
    public void countOccurenceSuccess() {
        int expected = 10;
        //Act
        int actual = countNumOfOccurenceOfChar.countOccurence("Java is java again java again","a");
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void countOccurenceFailure() {
        int expected = 0;
        //Act
        int actual = countNumOfOccurenceOfChar.countOccurence("Java is java again java again","w");
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void countOccurenceInvalidInput() {
        int expected = 0;
        //Act
        int actual = countNumOfOccurenceOfChar.countOccurence("Java is java again java again","null");
        //Assert
        assertEquals(expected,actual);

        int expected1 = 0;
        //Act
        int actual1 = countNumOfOccurenceOfChar.countOccurence(" "," ");
        //Assert
        assertEquals(expected,actual);
    }

}