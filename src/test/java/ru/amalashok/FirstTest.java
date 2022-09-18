package ru.amalashok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FirstTest {

    @Test
    void Test1 () {
        Assertions.assertFalse(1000 < 500);
    }

    @Test
    void Test2 () {
        Assertions.assertTrue(1000 >= 3);
    }



}
