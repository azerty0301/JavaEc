package day2;

import java.util.Calendar;
import java.util.Date;

public class TimeLesson {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "Java";
		for (int i = 0; i < 10000; i++) {
			str += "Java";
		}
		long end = System.currentTimeMillis();
		System.out.println("time1:" + (end - start));
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java:");
		}
		end = System.currentTimeMillis();
		System.out.println("time2:" + (end - start));

		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());

		Calendar c = Calendar.getInstance();//getInstanceメソッドの内部でこのカレンダークラスをnewして返している
		c.set(2019, 8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);

		now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
