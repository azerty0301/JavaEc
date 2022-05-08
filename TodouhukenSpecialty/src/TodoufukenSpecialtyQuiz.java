import java.util.HashMap;
import java.util.Scanner;

public class TodoufukenSpecialtyQuiz {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		map.put("サクランボ生産量日本一","山形");
		map.put("牡蠣(カキ)の生産量日本一","広島");
		map.put("うどんの出荷量日本一","香川");
		map.put("金のしゃちほこで有名な名古屋城がある","愛知");/*
		map.put("笹かまぼこで有名","宮城");
		map.put("聖徳太子が法隆寺を建てた","奈良");
		map.put("首里城がある","沖縄");
		map.put(" 伊香保温泉、草津温泉が有名","群馬");
		map.put("ナスの生産量日本一","高知");
		map.put("等院鳳凰堂がある","京都");
		map.put("みかんの生産量日本一有田みかんが有名","和歌山");
		map.put("そうめんの揖保の糸で有名","兵庫");
		map.put("わんこそばで有名","岩手");
		map.put("きりたんぽで有名","秋田");
		map.put(" 日本最古の温泉「道後温泉」がある","愛媛");
		map.put("きびだんごで有名","岡山");
		map.put("とんこつラーメン、辛子明太子で有名","福岡");
		map.put("落花生の生産量日本一","千葉");
		map.put("雷門・浅草寺がある","東京");
		map.put("琵琶湖(びわこ)がある","滋賀");
		map.put("メガネフレームの9割以上を作る鯖江市がある","福井");
		map.put("軽井沢、松本城があり、レタスの生産量日本一","長野");
		map.put("全国から神様が集まると言われる出雲大社がある","島根");
		map.put("ぶどうの収穫量全国一で、ワインも有名","山梨");
		map.put("二十世紀梨で有名","鳥取");
		map.put("下関市名産のフグや関門海峡で有名","山口");
		map.put("喜多方ラーメンで有名","福島");
		map.put("日本三名園「兼六園」で有名","石川");
		map.put(" 100年以上の歴史の「通天閣」がある","大阪");
		map.put("魚沼産コシヒカリで有名","新潟");
		map.put("松坂牛で有名","三重");
		map.put("海底炭鉱によって栄えた 通称「軍艦島」がある","長崎");
		map.put("世界遺産に登録された屋久島の屋久杉のある","鹿児島");
		map.put(" 400年の歴史を持つ「阿波踊り」で有名","徳島");
		map.put("有田焼「伊万里焼」で有名","佐賀");
		map.put("りんごの生産量日本一","青森");
		map.put("お茶の生産量日本一","静岡");
		map.put("日本三名泉の一つ、下呂温泉のある都道府県","岐阜");
		map.put("日本一の高さを誇る「黒部ダム」がある","富山");
		map.put("水戸納豆で有名","茨城");
		map.put("じゃがいも生産量日本一","北海道");
		map.put("別府や湯布院などで有名","大分");
		map.put("ピーマンの生産量日本一","宮崎");
		map.put("箱根温泉・中華街がある","神奈川");
		map.put("世界最大のカルデラを持つ「阿蘇山」がある","熊本");
		map.put(" 世界遺産・日光東照宮がある","栃木");
		map.put("草加せんべいで有名","埼玉");*/

		System.out.println("表示される特徴のある都道府県を漢字で入力してください（都・府・県は付けないで。）");
		int correct = 0;
		int TOTAL = 0;
		for(String s : map.keySet()) {//mapのキー(String型の名産品)全部の中から１つずつString sに移して、{}内の処理をしてくれる。
			System.out.printf("%s>>", s);
			String ans = scan.next();
			TOTAL ++;
			if(ans.equals(map.get(s))) {
				System.out.println("正解!");
				correct++;
			}else {
				System.out.printf("はずれ。正解は" + map.get(s) + "です。%n");
			}
		}
		System.out.printf("全%d問中%d問正解でした!", TOTAL,correct);
	}
}
