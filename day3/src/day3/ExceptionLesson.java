package day3;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionLesson {

	public static void main(String[] args) throws InterruptedException {
		FileWriter fw = null;
		try {

			fw = new FileWriter("data.txt");
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}

		try (FileWriter fw2 = new FileWriter("data.txt");) {
			fw2.write("hello2");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生");

		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		sleep();

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレースは（ここから）");
			e.printStackTrace();
			System.out.println("--スタックトレースは（ここまで）");
		}

		try {
			int num = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("変換不能な引数です");
			e.printStackTrace();
		}
	}
	static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
}
