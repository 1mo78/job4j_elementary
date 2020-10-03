package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenMultiMax1() {

        int result = MultiMax.max(16, 4, 2);
        assertThat(result, is(16));
    }

    @Test
    public void whenMultiMax2() {

        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));

    }

    @Test
    public void whenMultiMax3() {

        int result = MultiMax.max(16, 4, 22);
        assertThat(result, is(22));
    }

    @Test
    public void whenMultiMaxAll() {

        int result = MultiMax.max(17, 17, 17);
        assertThat(result, is(17));
    }

}