package ro.romdev;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void netPayment() {
        Assert.assertTrue(Main.netPayment(1, 1) == 0.85f);
        Assert.assertTrue(Main.netPayment(100, 20) == 1700f);
        Assert.assertTrue(Main.netPayment(13, 12) == 132.6f);
    }
}