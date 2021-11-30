package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void maxTwoOperand() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxThreeOperand() {
        int a = 10;
        int b = 9;
        int c = 100;
        int result = Max.max(a, b, c);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
    @Test

    public void maxFourOperand() {
        int a = 10;
        int b = 9;
        int c = 100;
        int d = -90;
        int result = Max.max(a, b, c, d);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxEqualsTwoOperand() {
        int a = 2;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxEqualsThreeOperand() {
        int a = 10;
        int b = 10;
        int c = 10;
        int result = Max.max(a, b, c);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxEqualsFourOperand() {
        int a = -90;
        int b = -90;
        int c = -90;
        int d = -90;
        int result = Max.max(a, b, c, d);
        int expected = -90;
        Assert.assertEquals(result, expected);
    }

}