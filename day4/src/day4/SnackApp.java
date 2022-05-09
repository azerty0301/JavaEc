package day4;
/*[確認問題]
以下のお菓子の中から2つを選択する。ただし、合計金額は200円以内でなければならない。
アメ:30円
チョコ:120円
ガム:100円
ポテチ:80円
ビスケット:90円
条件を満たす組み合わせをすべて列挙せよ。
出力フォーマットは以下のようにすること
[アメ(30),チョコ(120)]
[アメ(30),ガム(100)]
.
.*/
public class SnackApp {

	public static void main(String[] args) {
		Snack[] snacks= {
				new Snack("アメ",30),
				new Snack("チョコ",120),
				new Snack("ガム",100),
				new Snack("ポテチ",80),
				new Snack("ビスケット",90),
		};
		for(int i=0; i<snacks.length-1; i++) {
			for(int j=0; j<snacks.length; j++) {//お菓子２個の組み合わせだから２重for文。３個なら3重。
				if(snacks[i].price + snacks[j].price <= 200) {
					System.out.printf("[%s,%s]%n", snacks[i],snacks[j]);
				}
			}
		}
		System.out.println("重複あり");
		for(int i=0; i<snacks.length; i++) {
			for(int j=i+1; j<snacks.length+1; j++) {
				if(snacks[i].price+snacks[j-1].price<=200) {
					System.out.printf("[%s,%s]%n", snacks[i],snacks[j-1]);
				}
			}
		}
		System.out.println("重複あり・お菓子３つ・300円以下");
		for(int i=0; i<snacks.length; i++) {
			for(int j=i+1; j<snacks.length+1; j++) {
				for(int k=j+1; k<snacks.length+2; k++) {
					if(snacks[i].price + snacks[j-1].price + snacks[k-2].price <= 300) {
						System.out.printf("[%s,%s,%s]%n",snacks[i],snacks[j-1],snacks[k-2]);

					}
				}
			}
		}

	}

}
class Snack{
	String name;
	int price;
	Snack(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name,this.price);
	}
}
