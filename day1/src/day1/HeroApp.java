package day1;

public class HeroApp {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ロト");
		h.setHp(100);
		Wand wand=new Wand();
		wand.setName("魔法の杖");
		wand.setPower(20);
		Wizard wiz = new Wizard();
		wiz.setHp(100);
		wiz.setMp(100);
		wiz.setName("ゼシカ");
		wiz.setWand(wand);
		wiz.heal(h);
		System.out.println(h);//Hero.javaで@Overrideしている。toStringの内容をインスタンスを呼ぶだけで出してくれる。h.toStringと書くのと一緒。
	}
}