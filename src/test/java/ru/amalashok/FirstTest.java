package ru.amalashok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FirstTest {

    @Test
    void Test1 () {
        Assertions.assertFalse(40 > 200);
    }

    @Test
    void Test2 () {
        Assertions.assertTrue(100 >= 34);
    }



}
