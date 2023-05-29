import coe.unosquare.processor.DataCalculator;
import coe.unosquare.processor.DataList;
import coe.unosquare.processor.DataProcessing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class DataCalculatorTest {
    private Map<String, String> savingsByUser;

    @BeforeEach
    void processData(){
        DataProcessing userList = new DataProcessing(DataList.getInstance());
        savingsByUser = DataCalculator.calculateTotalSavings(userList.getUserList());
    }

    @Test
    void calculateTotalSavingsTest(){
        Assertions.assertEquals(96302.19, savingsByUser.get("Ron Weasly"));
        Assertions.assertEquals(178213.04, savingsByUser.get("Harry Potter"));
        Assertions.assertEquals(163705.02, savingsByUser.get("Hermione Granger"));
        Assertions.assertEquals(100000.00, savingsByUser.get("Fred Weasly"));
    }
}
