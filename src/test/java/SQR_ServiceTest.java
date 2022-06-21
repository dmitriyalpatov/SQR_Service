import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQR_ServiceTest {
    @Test
    public void SquaringAtTheCorrectBoundaryValues() {
        SQRService service = new SQRService();

        int square =16;
        int expected = 256;

        int actual = service.squaring(200,300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SquaringBelowTheBoundaryValues() {
        SQRService service = new SQRService();

        int square =18;
        int expected = 324;

        int actual = service.squaring(200,300);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void SquaringWhenExceedingTheBoundaryValues() {
        SQRService service = new SQRService();
        int square =12;
        int expected = 144;

        int actual = service.squaring(160, 16);

        Assertions.assertEquals(expected, actual);

    }

}