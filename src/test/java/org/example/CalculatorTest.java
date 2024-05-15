package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calc calc;


    @BeforeAll
    static void init() {
        calc = new Calculator();
    }

    @BeforeEach
    void before() {
//        calc = new Calculator();
    }

    @AfterEach
    void after() {
        //
    }

    @AfterAll
    static void finish() {
        //
    }

    @Test
    void add1() {
        Assertions.assertEquals(5, calc.add(2, 3));
    }

    @Test
    void add2() {
        Assertions.assertEquals(10, calc.add(7, 3));
    }

    @Test
//    @Disabled("на рефакторинге")
    void mul() {
        Assertions.assertEquals(21, calc.mul(7, 3));
    }

    @Test
//    @Disabled
    void mul2() {
        Assertions.assertEquals(35, calc.mul(7, 5));
    }

    @Test
    @Timeout(2)
    void div() {
        Assertions.assertEquals(3, calc.div(33, 11));
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void div2() {
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(15, 0));
    }

    @CsvSource({
            "5, 2, 3",
            "-5, -2, -3",
            "-5, 2, -7",
            "0, 0, 0",
            "0, 2, -2",
    })

    @ParameterizedTest
    void massTestAdd(int sum, int a, int b) {
        Assertions.assertEquals(sum, calc.add(a, b));
    }


    @Test
    void testSortArr() {
        Assertions.assertArrayEquals(new int[]{2, 4, 6}, calc.sortArr(new int[]{6, 4, 2}));
    }

    static Stream<Arguments> dataForMassTestSortArr() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 4, 6}, new int[]{6, 4, 2}),
                Arguments.arguments(new int[]{2, 5}, new int[]{5, 2}),
                Arguments.arguments(new int[]{5, 8, 11}, new int[]{5, 11, 8}),
                Arguments.arguments(new int[]{2}, new int[]{2}),
                Arguments.arguments(new int[]{-5, 0, 2, 4, 6}, new int[]{6, 4, 2, 0, -5})
        );
    }


    @ParameterizedTest
    @MethodSource("dataForMassTestSortArr")
    void massTestSortArr(int[] exp, int[] arr) {
        Assertions.assertArrayEquals(exp, calc.sortArr(arr));
    }


}