package day2;

public class HighScore {
	private int score;//scoreメソッドをprivateで作成
	private String date;

	public HighScore(int score, String date) {//コンストラクタ
		this.score = score;
		this.date = date;
	}

	@Override
	public String toString() {
		return this.score + " " + this.date;
	}

	public String toCSV() {
		return this.score + " , " + this.date;
	}

	public int getScore() {
		return this.score;
	}
}
