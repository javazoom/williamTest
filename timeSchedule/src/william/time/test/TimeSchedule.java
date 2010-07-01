package william.time.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2010-6-29
 * Time: 18:41:05
 * Java time code ʹ��
 */
public class TimeSchedule {
    public static void main(String[] args) {
        System.out.println(new Date().toString());
        System.out.println(Calendar.getInstance().getTime());

        Date date = Calendar.getInstance().getTime();

        DateFormat format = DateFormat.getInstance();
        System.out.println(format.format(date));


        
        //���и�ʽ��ʱ���ʾ
//        DateFormat format2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat format2 = DateFormat.getDateTimeInstance();
        System.out.println(format2.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());

    }
    
}
