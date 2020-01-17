package ro.romdev;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testX1() {
        Assert.assertTrue(Main.myFunction(12) == 1);
        Assert.assertTrue(Main.myFunction(15) == 3);
        Assert.assertTrue(Main.myFunction(22) == 2);
        Assert.assertTrue(Main.myFunction(-100) == 0);
        Assert.assertTrue(Main.myFunction(150) == 10);
    }
}