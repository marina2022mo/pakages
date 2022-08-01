package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.sqr.SQRService;


public class SQRServiceTest {

    @ParameterizedTest
    //@CsvSource({
            //"3,200,300",
            //"5,200,500
    //})
    @CsvFileSource(files="src/test/resources/number.csv")
    public void test (int expected, int up, int dn) {
        SQRService service = new SQRService();
        //int expected = 3;
        int actual = service.calcSqrNumber;
        Assertions.assertEquals(expected,actual);
    }
}

