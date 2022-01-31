import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRservice;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceNumberSquareTest {

    @Test
    void calculate() {
        SQRservice service = new SQRservice();
        int min = 10;
        int max = 99;

        int actual = service.calculate(10, 99);

        assertEquals(min, actual);
    }
}