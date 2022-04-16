import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculateTest {
    CircleCalculate sut;

    @BeforeEach
    public void init() {
        System.out.println("tests started");
        sut = new CircleCalculate();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testCalculateCircleLength() {
        int radius = 100;
        double expected = 628.00;
        //double PI = 3.14;
        //int expected = 628;
        double result = sut.calculateCircleLength(radius);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateCircleSector() {
        int radius = 100;
        double expected = 157.00;
        double result = sut.calculateCircleSector(radius);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateCircleArea() {
        int radius = 10;
        double expected = 314.00;
        double result = sut.calculateCircleArea(radius);
        assertEquals(expected, result);
    }

    @Test
    public void testMassege() {

        final String expected = "Всё хорошо";

        String result = sut.Massege();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLenghtRadius() {

        int radius = 1000;

        final int expected = 4;

        int result = sut.LenghtRadius(radius);

        assertEquals(expected, result);
    }

}

