package utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User:Jason.Jia
 * Date:2014/11/3
 * Time:15:00
 */
public class StringUtilTest {
    /**
     * Logger.
     */
    public final static Logger LOGGER =
            LoggerFactory.getLogger(StringUtilTest.class);

    @Test
    public void getRandomNumStrTest() {
        String numStr = StringUtil.getRandomNumStr(50);
        LOGGER.info("返回的随机数为：" + numStr);
    }
}
