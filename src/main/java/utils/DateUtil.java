package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User:Jason.Jia
 * Date:2014/10/8
 * Time:11:19
 */
public final class DateUtil {
    /**
     * Logger.
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(DateUtil.class);

    private DateUtil(){

    }

    /**
     * 得到指定格式的日期
     * @param pattern
     * @return
     */
    public static String getDate(final String pattern){
        final Date date = new Date();
        final SimpleDateFormat format = new SimpleDateFormat(pattern);
        final String dateStr = format.format(date);
        return dateStr;
    }

    /**
     * 字符串转日期格式
     * @param dateStr
     * @param pattern
     * @return
     */
    public static Date str2date(final String dateStr,final String pattern){

        final SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            return format.parse(dateStr);
        } catch (ParseException e) {
            LOGGER.error("parse date error:" + e);
        }
        return null;
    }

    /**
     * 日期转字符串
     * @param date
     * @param pattern
     * @return
     */
    public static String date2str(final Date date,final String pattern){
        if(date == null){
            return null;
        }
        final SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }
}
