package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140rubThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140rubThen2Dollar() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140DollarThen8400Ruble() {
        int in = 140;
        int expected = 8400;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140EuroThen9800Ruble() {
        int in = 140;
        int expected = 9800;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
}
