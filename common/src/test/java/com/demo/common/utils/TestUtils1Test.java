package com.demo.common.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestUtils1Test {

    @Test
    void testCountCharNumInStr1() {
        int result = TestUtils1.countCharNumInStr("", 'a');
        Assertions.assertEquals(0, result);
    }

//    @Test
//    void testCountCharNumInStr2() {
//        int result = TestUtils1.countCharNumInStr("aa", 'a');
//        Assertions.assertEquals(2, result);
//    }
}