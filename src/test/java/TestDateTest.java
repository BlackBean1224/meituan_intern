import org.junit.Test;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

import static org.junit.Assert.*;

/**
 * @author bean
 * @date 2020/7/16
 */
public class TestDateTest {

    @org.junit.Test
    public void testDateFormat() {
        new TestDate().testDateFormat();
    }

    @Test
    public void getTodayStartTime() {
        long todayTime = TestDate.getTodayStartTime();
        System.out.println(todayTime);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(ft.format(todayTime));
//        assertEquals(1594828800, TestDate.getTodayStartTime() / 1000);
    }
}