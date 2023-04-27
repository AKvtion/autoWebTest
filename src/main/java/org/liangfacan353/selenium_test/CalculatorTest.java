package org.liangfacan353.selenium_test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculate Calculate = new Calculate();
        double result = Calculate.add(10.0, 20.0);
        Assert.assertEquals(30.0, result, 0);
    }

    //测试减法功能：
    @Test
    public void testSubtract() {
        Calculate Calculate = new Calculate();
        double result = Calculate.sub(10.0, 5.0);
        Assert.assertEquals(5.0, result, 0);
    }

    //测试乘法功能：
    @Test
    public void testMultiply() {
        Calculate Calculate = new Calculate();
        double result = Calculate.mcl(3.0, 4.0);
        Assert.assertEquals(12.0, result, 0);
    }

    //测试除法功能：
    @Test
    public void testDivide() {
        Calculate Calculate = new Calculate();
        double result = Calculate.div(10.0, 2.0);
        Assert.assertEquals(5.0, result, 0);
    }

    // 测试除数为0时的异常情况：断言是否抛出了ArithmeticException异常
    // ArithmeticException异常指 0做了分母，报算术运算异常
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculate Calculate = new Calculate();
        double result = Calculate.div(10.0, 0);
    }
}
