import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQR_ServiceTest {
    @Test
    public void SquaringAtTheCorrectBoundaryValues() {
        SQRService service = new SQRService();

        int square = 225;
        int expected = 15;

        int actual = service.squaring(square);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SquaringBelowTheBoundaryValues() {
        SQRService service = new SQRService();

        int square = 121;
        int expected = 11;

        int actual = service.squaring(square);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void SquaringWhenExceedingTheBoundaryValues() {
        SQRService service = new SQRService();

        int square = 625;
        int expected = 25;

        int actual = service.squaring(square);

        Assertions.assertEquals(expected, actual);

    }

}