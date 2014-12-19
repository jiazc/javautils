package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * User:Jason.Jia
 * Date:2014/10/8
 * Time:13:47
 */
public final class StringUtil {
    /**
     * Logger.
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(StringUtil.class);

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(final String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }

    /**
     * obj转为int
     *
     * @param obj
     * @return
     */
    public static int obj2int(final Object obj) {
        int ret = 0;
        if (obj == null) {
            return ret;
        }
        try {
            ret = (Integer) obj;
        } catch (ClassCastException e) {
            LOGGER.error("obj to int error:" + e.getMessage());
        }
        return ret;
    }

    /**
     * str转为int
     *
     * @param numstr
     * @return
     */
    public static int str2int(final String numstr) {
        int ret = 0;
        if (isEmpty(numstr)) {
            return ret;
        }
        try {
            ret = Integer.parseInt(numstr);
        } catch (NumberFormatException e) {
            LOGGER.error("str to int error:" + numstr);
        }
        return ret;
    }

    /**
     * str转为long
     *
     * @param numstr
     * @return
     */
    public static long str2long(final String numstr) {
        long ret = 0;
        if (StringUtil.isEmpty(numstr)) {
            return ret;
        }
        try {
            ret = Long.parseLong(numstr);
        } catch (NumberFormatException e) {
            LOGGER.error("str to long error:" + numstr);
        }
        return ret;
    }

    /**
     * str转为float
     *
     * @param numstr
     * @return
     */
    public static float str2float(final String numstr) {
        float ret = 0;
        if (StringUtil.isEmpty(numstr)) {
            return ret;
        }
        try {
            ret = Float.parseFloat(numstr);
        } catch (NumberFormatException e) {
            LOGGER.error("str to float error:" + numstr);
        }
        return ret;
    }

    /**
     * 字符串截取
     *
     * @param str
     * @param begin
     * @param end
     * @return
     */
    public static String cutStr(final String str, final int begin,
            final int end) {
        if (isEmpty(str)) {
            return null;
        }
        if (end >= str.length()) {
            return str.substring(begin, str.length());
        }
        return str.substring(begin, end);
    }
    /**
     * 返回指定位数的随机数
     * @param size
     * @return
     */
    public static String getRandomNumStr(int size){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<size;i++){
            sb.append((int)(Math.random()*10));
        }
        return sb.toString();
    }
}
