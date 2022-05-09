package day4;

import java.util.Scanner;

public class TileApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("縦>>");
		int x = scan.nextInt();
		System.out.print("横>>");
		int y = scan.nextInt();
		int gcd = GCD(x,y);
		int num = (x/gcd)*(y/gcd);
		System.out.printf("1辺が%dのタイルを%d枚で埋めます%n",gcd,num);

	}
	static int GCD(int x, int y) {
		if(x % y == 0) {
			return y;
		}
		return GCD(y,x%y);
	}

}
