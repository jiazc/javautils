package utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User:Jason.Jia
 * Date:2014/10/8
 * Time:11:28
 */
public class DateUtilTest {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(DateUtilTest.class);
    @Test
    public void getDateTest(){
        String dateStr = "yyyyMMdd";
        String date = DateUtil.getDate(dateStr);
        LOGGER.error("date:" + date);
    }
}
