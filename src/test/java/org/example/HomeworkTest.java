package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeworkTest {


    static Stream<Arguments> dataForMassTestArr() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 7}, new int[]{2, 2, 4, 1, 7}),
                Arguments.arguments(new int[]{}, new int[]{2, 2, 4}),
                Arguments.arguments(new int[]{1, 7, 3, 1, 2}, new int[]{2, 2, 4, 1, 7, 3, 1, 2}),
                Arguments.arguments(new int[]{1, 7}, new int[]{2, 2, 4, 1, 7}),
                Arguments.arguments(new int[]{1, 7}, new int[]{2, 2, 4, 1, 7})
        );
    }
    @ParameterizedTest
    @MethodSource("dataForMassTestArr")
    void massTestArr(int[] exp, int[] arr){
        Assertions.assertArrayEquals(exp, Homework.array(arr));
    }

    @Test
    void testArr() {
        Assertions.assertArrayEquals(new int[]{1, 7}, Homework.array(new int[]{2, 2, 4, 1, 7}));
    }
    @Test
    void testExpArr() {
        Assertions.assertThrows(RuntimeException.class, ()->Homework.array(new int[]{2, 2, 3, 1, 7}) );
    }

    @Test
    void testOneAndFour(){
        Assertions.assertTrue(Homework.oneAndFour(new int[]{1, 4, 4, 1, 1,}));
        Assertions.assertFalse(Homework.oneAndFour(new int[]{1, 4, 4, 1, 1, 2}));
        Assertions.assertFalse(Homework.oneAndFour(new int[]{1, 1, 1, 1, 1, 1}));
        Assertions.assertFalse(Homework.oneAndFour(new int[]{4, 4, 4, 4}));
    }
}
