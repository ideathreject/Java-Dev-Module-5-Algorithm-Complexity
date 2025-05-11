package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private FibonacciIterate iterativeCalc;
    private FibonacciDynamicProgramming dynamicCalc;
    private FibonacciRecursive recursiveCalc;

    @BeforeEach
    void setUp() {
        iterativeCalc = new FibonacciIterate();
        dynamicCalc = new FibonacciDynamicProgramming();
        recursiveCalc = new FibonacciRecursive();
    }


    @Test
    void givenZeroReturnZeroUsingIterateMethod() {

        int input = 0;

        long actualResult = iterativeCalc.calculate(input);

        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenOneReturnOneUsingIterateMethod() {

        int input = 1;

        long actualResult = iterativeCalc.calculate(input);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSixReturnEightUsingIterateMethod() {

        int input = 6;

        long actualResult = iterativeCalc.calculate(input);

        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void givenZeroReturnZeroUsingRecursiveMethod() {

        int input = 0;

        long actualResult = recursiveCalc.calculate(input);

        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenOneReturnOneUsingRecursiveMethod() {

        int input = 1;

        long actualResult = recursiveCalc.calculate(input);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSixReturnEightUsingRecursiveMethod() {

        int input = 6;

        long actualResult = recursiveCalc.calculate(input);

        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void givenZeroReturnZeroUsingDynamicMethod() {

        int input = 0;

        long actualResult = dynamicCalc.calculate(input);

        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenOneReturnOneUsingDynamicMethod() {

        int input = 1;

        long actualResult = dynamicCalc.calculate(input);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSixReturnEightUsingDynamicMethod() {

        int input = 6;

        long actualResult = dynamicCalc.calculate(input);

        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }
}