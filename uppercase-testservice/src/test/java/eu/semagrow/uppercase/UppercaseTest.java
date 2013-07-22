package eu.semagrow.uppercase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UppercaseTest {

    private Uppercase uppercase;

    @Before
    public void setUp() {
        this.uppercase = new Uppercase();
    }

    @Test
    public void toUppercase() {
        Assert.assertEquals("UPPERCASE", uppercase.toUppercase("uppercase"));
    }

}