package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test
    public void WhenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void WhenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void WhenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}