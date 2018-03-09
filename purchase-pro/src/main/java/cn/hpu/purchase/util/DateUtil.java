package cn.hpu.purchase.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author
 */
public class DateUtil {

    public final static String SDF_YEAR = "yyyy";

    public final static String SDF_DAY = "yyyy-MM-dd";

    public final static String SDF_DAYS = "yyyyMMdd";

    public final static String SDF_TIME = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取YYYY格式
     *
     * @return
     */
    public static String getYear() {
        return new SimpleDateFormat(SDF_YEAR).format(new Date());
    }

    /**
     * 获取YYYY-MM-DD格式
     *
     * @return
     */
    public static String getDay() {
        return new SimpleDateFormat(SDF_DAY).format(new Date());
    }

    /**
     * 获取YYYYMMDD格式
     *
     * @return
     */
    public static String getDays() {
        return new SimpleDateFormat(SDF_DAYS).format(new Date());
    }

    /**
     * 获取YYYY-MM-DD HH:mm:ss格式
     *
     * @return
     */
    public static String getTime() {
        return new SimpleDateFormat(SDF_TIME).format(new Date());
    }

    /**
     * @param s
     * @param e
     * @return boolean
     * @throws
     * @Title: compareDate
     * @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)
     * @author luguosui
     */
    public static boolean compareDate(String s, String e) {
        if (formatDate(s) == null || formatDate(e) == null) {
            return false;
        }
        return formatDate(s).getTime() >= formatDate(e).getTime();
    }

    /**
     * 格式化日期
     *
     * @return
     */
    public static Date formatDate(String date) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return fmt.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 自定义格式格式化日期
     *
     * @return
     */
    public static Date formatDate(String date, String style) {
        SimpleDateFormat fmt = new SimpleDateFormat(style);
        try {
            return fmt.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 校验日期是否合法
     *
     * @return
     */
    public static boolean isValidDate(String s) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fmt.parse(s);
            return true;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return false;
        }
    }

    public static int getDiffYear(String startTime, String endTime) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            long aa = 0;
            int years = (int) (((fmt.parse(endTime).getTime() - fmt.parse(startTime).getTime()) / (1000 * 60 * 60 * 24)) / 365);
            return years;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return 0;
        }
    }

    /**
     * <li>功能描述：时间相减得到天数
     *
     * @param beginDate
     * @param endDate
     * @return long
     * @author Administrator
     */
    public static long getDaySub(Date beginDate, Date endDate) {
        long day = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String beginDateStr = null;
        String endDateStr = null;

        try {
            beginDateStr = format.format(beginDate);
            endDateStr = format.format(endDate);
            beginDate = format.parse(beginDateStr);
            endDate = format.parse(endDateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);

        return day;
    }

    /**
     * 得到n天之后的日期
     *
     * @param days
     * @return
     */
    public static String getAfterDayDate(String days) {
        int daysInt = Integer.parseInt(days);
        // java.util包
        Calendar canlendar = Calendar.getInstance();
        // 日期减 如果不够减会将月变动
        canlendar.add(Calendar.DATE, daysInt);
        Date date = canlendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 得到n天之前的日期
     *
     * @param days
     * @return
     */
    public static String getBeforeDayDate(Integer days) {
        Calendar canlendar = Calendar.getInstance();
        // 日期减 如果不够减会将月变动
        canlendar.add(Calendar.DATE, -days);
        Date date = canlendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);

        return dateStr;
    }

    /**
     * 得到n天之后是周几
     *
     * @param days
     * @return
     */
    public static String getAfterDayWeek(String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance();
        // 日期减 如果不够减会将月变动
        canlendar.add(Calendar.DATE, daysInt);
        Date date = canlendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("E");
        String dateStr = sdf.format(date);

        return dateStr;
    }

    /**
     * 获取当天开始时间 格式为 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static Date getTodayStartDate() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        Date startTime = todayStart.getTime();
        return formatDate(new SimpleDateFormat(SDF_TIME).format(startTime), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取当天结束时间 格式为 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static Date getTodayEndDate() {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.set(Calendar.HOUR, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        Date endTime = todayEnd.getTime();
        return formatDate(new SimpleDateFormat(SDF_TIME).format(endTime), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取指定时间那天的 23:59:59结束的时间
     *
     * @param date
     * @return
     */
    public static Date getDateEndDay(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        Date endDay = c.getTime();
        return formatDate(new SimpleDateFormat(SDF_TIME).format(endDay), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取指定时间那天的 00:00:00开始的时间
     *
     * @param date
     * @return
     */
    public static Date getDateStartDay(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date startDay = c.getTime();
        return formatDate(new SimpleDateFormat(SDF_TIME).format(startDay), "yyyy-MM-dd HH:mm:ss");
    }


    public static String getRandomFileName() {

        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("yyMMdd");

        Date date = new Date();

        String str = simpleDateFormat.format(date);

        Random random = new Random();
        // 获取5位随机数
        int num = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        // 当前时间
        return str + num;
    }
}
