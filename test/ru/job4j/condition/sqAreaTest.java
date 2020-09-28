package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class sqAreaTest {

    @Test
    public void when62Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = sqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84Then0() {
        int expected = 0;
        int p = 8;
        int k = 4;
        double out = sqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11Then0() {
        int expected = 0;
        int p = 1;
        int k = 1;
        double out = sqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}