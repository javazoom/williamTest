package william.time.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2010-6-29
 * Time: 18:41:05
 * Java time code 使用
 */
public class TimeSchedule {
    public static void main(String[] args) {
        System.out.println(new Date().toString());
        System.out.println(Calendar.getInstance().getTime());

        Date date = Calendar.getInstance().getTime();

        DateFormat format = DateFormat.getInstance();
        System.out.println(format.format(date));


        
        //具有格式的时间表示
//        DateFormat format2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat format2 = DateFormat.getDateTimeInstance();
        System.out.println(format2.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());

//       时间运算,年月日的时间搞定，小时分钟秒还没呢；
            // 声明一个当前时间
        GregorianCalendar grc = new GregorianCalendar();
        // 设定一个格式化标准
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 对当前时间进行运算 其中第一个参数可以设置进行运算的单位
        grc.add(GregorianCalendar.YEAR, 1);
        grc.add(GregorianCalendar.MONTH, 2);
        grc.add(GregorianCalendar.DATE, 3);

        // 代码原型
        grc.set(2010,7,7,9,15,0);
        grc.add(GregorianCalendar.MINUTE, 25);

        int init_hour = 6;
        int init_minute = 15;
        int init_second = 0;

        GregorianCalendar init_calendar = new GregorianCalendar();

        init_calendar.set(GregorianCalendar.HOUR, init_hour);
        init_calendar.set(GregorianCalendar.MINUTE, init_minute);
        init_calendar.set(GregorianCalendar.SECOND, init_second);
        
        int workTime = 25;
        int resetTime = 5;
        System.out.println("---------start time-------------");
            System.out.println(sdf.format(init_calendar.getTime()));
        for(int i = 1; i < 35; i++)
        {
           init_calendar.add(GregorianCalendar.MINUTE, workTime);
           System.out.println(sdf.format(init_calendar.getTime()));
           init_calendar.add(GregorianCalendar.MINUTE, resetTime);
           System.out.println(sdf.format(init_calendar.getTime()));

        }


        System.out.println("---------end time-------------");

//        System.out.println(sdf.format(grc.getTime()));
    }
    
}
