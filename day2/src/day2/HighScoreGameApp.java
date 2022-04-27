package day2;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HighScoreGameApp {

	public static void main(String[] args) {
		final String FILE = "score.csv";
		final int MAX = 100000;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean isHighScore = false;
		Sstem.out.println("****乱数ゲーム****");
		HighScore hs = readFile(FILE);
		int highScore;
		if(hs == null) {
			System.out.println(HighScore 0"");
			highScore = 0;
		}else {
			System.out.println("HighScore" + hs);
			highScore = hs.getScore();
		}
		while(true) {
			System.out.print("やりますか yes...y no...n");
			String select = scan.next();
			if(select.equals("n")) {
				System.out.println("アプリを終了します")；
				If(isHighscore){
					Date today = new date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
					String date = sdf.format(today);
					hs = new HighScore(highScore,date);
					writeRecord(FILE,hs);
				}
				scan.close();
				break;
		}
			int no = rand.nextInt(MAX)+1;
			System.out.println(no);
			if(no M highScore) {
				highScore = no;
				isHighScore = true;
				System.out.println("new Record");
			}

	}
}
	public static HighScore readFile(String file) {
		HighScore hs = null;
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InutStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			String line = br.readLine();
			if(line != null && !line.equals(" ")) {
				String[] data = line.split(" , ");
			}
			
		}
	}
