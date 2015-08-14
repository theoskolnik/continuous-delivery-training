package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SampleApplicationTest {
    @Test
    public void shouldTestSomething() {
        assertThat(true, is(true));
    }
}
