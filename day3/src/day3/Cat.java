package day3;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void makeNoise() {
		System.out.println("にゃー");
	}
	public void sleep() {
	System.out.println("すやすや");
	}
}
