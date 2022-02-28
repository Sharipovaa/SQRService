import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRservice;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceNumberSquareTest {

    @ParameterizedTest
    @CsvSource(value = {"min, 10, 4",
            "max, 99, 4"})
    public void shouldFindSquare() {
        SQRservice service = new SQRservice();
        int expected = 4;
        int actual = service.findSquare(10, 99);

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {"min, 100, 10",
            "max, 999, 10"})
    public void shouldFindSquareNum1() {
        SQRservice service = new SQRservice();
        int expected = 10;
        int actual = service.findSquare(100, 999);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"min, 200, 10",
            "max, 300, 10"})
    public void shouldFindSquareNum2() {
        SQRservice service = new SQRservice();
        int expected = 3;
        int actual = service.findSquare(200, 300);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"min, 500, 10",
            "max, 900, 10"})
    public void shouldFindSquareNum3() {
        SQRservice service = new SQRservice();
        int expected = 8;
        int actual = service.findSquare(500, 900);

        assertEquals(expected, actual);
    }
}