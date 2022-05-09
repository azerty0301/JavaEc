package day4;
/*袋に9つのボールが入っていてそのひとつひとつに１〜９の番号がついている。ちょうどビリヤードの球が袋に9つ入っている様子を想像してもらえればよい。
その袋から３つ取り出してその番号の合計が１０になる組み合わせを列挙せよ。*/
public class CombApp {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=8; j++) {
				for(int k=1; k<=9; k++) {
					if(i+j+k == 10) {
						System.out.print(" "+i+j+k+" ");
					}
				}
			}
		}

	}

}
