package day1;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("World");

	Map<String, Integer> map = new HashMap<>();
	map.put("東京", 1300);
	map.put("神奈川", 900);
	map.put("埼玉", 740);
	System.out.println(map);
	}
}
