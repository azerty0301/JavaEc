import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DQW {

	public static void main(String[] args) {
		final Scanner SC = new Scanner(System.in);
		Map<Card, Integer>cards = new LinkedHashMap<>() {
			{
				put(new Card('S',3,240),0);
				put(new Card('A',5,48),0);
				put(new Card('B',10,12),0);
				put(new Card('C',30,3),0);
				put(new Card('D',52,1),0);//インスタンスイニシャライザ？
			}
		};


		/*
		System.out.print("何枚ひく>>");
		int num = SC.nextInt();
		for(int i=0; i<num; i++) {
			Card card = drawCard(cards);
		System.out.println(card.rank+ "が出ました!");
		cards.put(card,cards.get(card)+1);
		}
		showCards(cards);
		System.out.println("合成しました");
		synthesizeCards(cards);
		showCards(cards);
		*/

		System.out.print("カードを任意枚数にセットします\n" + "0,2,1,3,4 のように\n" +" カンマ区切りでS,A,B,C,Dの枚数を入力してください>>");
		String[] numArr  = SC.next().split(",");
		int[]cardCounts = new int[numArr.length];
		for(int i=0; i<cardCounts.length; i++) {
			cardCounts[i] = Integer.parseInt(numArr[i]);
		}
		setCards(cards,cardCounts);
		System.out.println("指定枚数でセットしました");
		showCards(cards);

		simulator(cards,1,100);

	}
static void showCards(Map<Card,Integer> cards) {
	for(Card c:cards.keySet()) {
		System.out.printf("%s(%d)",c.rank,cards.get(c));
	}
	System.out.println();
}
static Card drawCard(Map<Card,Integer> cards) {
	Card card = null;
	int n = (int)(Math.random()*100);
	for(Card c:cards.keySet()) {
		if(n-c.ratio < 0) {
			card = c;
			break;
		}
		n -= c.ratio;
	}
	return card;
}
static void synthesizeCards(Map<Card,Integer> cards) {
	int totalPoint = 0;
	for(Card c : cards.keySet()) {
		totalPoint += c.point * cards.get(c);
	}
	for(Card c:cards.keySet()) {
		cards.put(c, totalPoint / c.point);
		totalPoint = totalPoint%c.point;
	}
}
static void setCards(Map<Card,Integer> cards,int[] cardCounts) {
	int idx = 0;
	for(Card key:cards.keySet()) {
		cards.put(key,cardCounts[idx++]);
	}
}
static void simulator(Map<Card,Integer>cards,int sCount,int tryCount) {
	int nowPoint = 0;
	for(Card c:cards.keySet()) {
		nowPoint += c.point*cards.get(c);
	}
	if(nowPoint >= sCount * 240) {
		System.out.println("カードを引く必要はありません");
		return;
	}
	Map<Integer,Integer>result = new TreeMap<>();
	for(int i=0; i<tryCount; i++) {
		int count = 0;
		int tempPoint = nowPoint;
		while(tempPoint < sCount * 240) {
			count++;
			Card card = drawCard(cards);
			tempPoint += card.point;
		}
		if(result.containsKey(count)) {
			result.put(count, result.get(count) + 1);
		}else {
			result.put(count, 1);
		}
	}

	int total = 0;
	for(int key:result.keySet()) {
		System.out.printf("%3d(%3d):",key,result.get(key));
		total +=key * result.get(key);
		for(int i=0; i<result.get(key); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.printf("平均:%.1f回%n",total/(double)tryCount);
}

}
class Card{
	Character rank;
	int ratio;
	int point;
	Card(Character rank, int ratio, int point){
		this.rank = rank;
		this.ratio = ratio;
		this.point = point;
	}



}