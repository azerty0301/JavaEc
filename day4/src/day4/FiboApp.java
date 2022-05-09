package day4;

public class FiboApp {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i+":"+fibo(i));
		}

	}
	static int fibo(int count) {
		if(count <= 2) {
			return 1;
		}
		return fibo(count-1)+fibo(count-2);
	}

}
//ずっと呼び出しているからちょっと重くなり、処理時間がかかる。(ねずみ講みたいな)→メモ化？キャッシュで解決できる。
