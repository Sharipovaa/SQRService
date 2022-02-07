import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRservice;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceNumberSquareTest {

    @ParameterizedTest
    @CsvSource(value = {"min, 10, 4",
            "max, 99, 4"})
    void shouldFindSquare() {
        SQRservice service = new SQRservice();
        int expected = 4;
        int actual = service.findSquare(10, 99);

        assertEquals(expected, actual);
    }
}