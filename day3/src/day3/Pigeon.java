package day3;

public class Pigeon extends Animal implements Flyable{

	Pigeon(String name) {
		super(name);
	}

	@Override
	public void Fly() {
		System.out.println("ばさばさばさ");
	}

	@Override
	void makeNoise() {
		System.out.println("ぽぽぽ");

	}

}
