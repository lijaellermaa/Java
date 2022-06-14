package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTest {

    @Test
    public void sum() {
        com.company.Test numbers = new com.company.Test();
        int actual = numbers.sum(10);
        int expected = 55;
        assertEquals(actual, expected);
    }
}
