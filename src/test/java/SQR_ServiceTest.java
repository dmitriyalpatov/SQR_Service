import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQR_ServiceTest {
    @Test
    public void SquaringAtTheCorrectBoundaryValues() {
        SQRService service = new SQRService();
        int a =15;
        int b =15;
        int c = a*b;
        int expected = 225;

        int actual = service.squaring(50,200);

        Assertions.assertEquals(expected, actual,c);


    }

    @Test
    public void SquaringBelowTheBoundaryValues() {
        SQRService service = new SQRService();

        int a =17;
        int b =16;
        int c = a*b;
        int expected = 272;

        int actual = service.squaring(300,600);

        Assertions.assertEquals(expected, actual, c);




    }

    @Test
    public void SquaringWhenExceedingTheBoundaryValues() {
        SQRService service = new SQRService();
        int a =15;
        int b =15;
        int c = a*b;
        int expected = 225;

        int actual = service.squaring(200, 300);

        Assertions.assertEquals(expected, actual,c);


    }

}