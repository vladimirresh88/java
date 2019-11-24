package ru.lesson.lessions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        calc.add(1,1);
        assertEquals(2, calc.result);
    }

    @Test(expected = UserExeption.class)
    public void TestDiv() throws UserExeption {
        Calculator calc = new Calculator();
        calc.div();
        assertEquals(1, calc.result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestDivRuntimeExeption() throws UserExeption {
        Calculator calc = new Calculator();
        calc.div(1,0);
    }

}