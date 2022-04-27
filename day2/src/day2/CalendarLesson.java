package day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarLesson {

	public static void main(String[] args) {
		Date now = new Date();//現在の日時をDate型で取得
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);//取得した日時情報をCalendarにセット
		int date = cal.get(Calendar.DATE);//Calendarから「日」の数値を取得
		cal.set(Calendar. DATE,date + 100);//取得した値に100を足した値をCalendarの「日」にセット
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日(E)");//SimpleDateFormatw用いて、指定された形式でDateインスタンスの内容を表示する
		String result = sdf.format(d);
		System.out.println(result);

	}

}
