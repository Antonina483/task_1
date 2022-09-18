package ru.amalashok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void Test1 () {
        Assertions.assertFalse(2 < 1);
    }

    @Test
    void Test2 () {
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void Test3 () {
        Assertions.assertTrue(10 > 5);
    }


}
