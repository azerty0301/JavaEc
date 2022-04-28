package day3;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(-5);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("ファイル名>>");
		String file = new Scanner(System.in).next();
		try {
			checkFormat(file);
			System.out.println("OK");
		} catch (UnsupportedMusicFileException e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
		}

	}
	static void checkFormat(String fileName) throws UnsupportedMusicFileException {
		String[] params = fileName.split("\\.");
		String ext = params[params.length-1];
		if(!ext .equals("mp3")) {
			throw new UnsupportedMusicFileException("mp3以外は不可");
		}
	}

}
class Person{
	int age;
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("年齢は正の整数");
		}
		this.age = age;
		}
}
