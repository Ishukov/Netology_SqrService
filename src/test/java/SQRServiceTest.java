import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.SQRService;

public class SQRServiceTest {
    @Test
    public void amountSqrLimPositiv() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSqrLowlimZero() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSqr(0, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSqrHighlimZero() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(200, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSqLowLimNegativ() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSqr(-200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSqrHighLimNegativ() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqr(200, -300);
        Assertions.assertEquals(expected, actual);
    }
}

