package ro.romdev;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculateCalories() {
        Assert.assertTrue(Main.calculateCalories(10, 11, 100) == 9.921429f);
        Assert.assertTrue(Main.calculateCalories(1, 1, 1) == 0.27142859f);
        Assert.assertTrue(Main.calculateCalories(0, 0, 0) == 0);
    }
}