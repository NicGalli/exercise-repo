package org.galli.exercise;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
    void testSum() {
    	assertThat(App.sum(4,5)).isEqualTo(9);
    }

}
