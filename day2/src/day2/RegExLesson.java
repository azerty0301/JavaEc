package day2;

public class RegExLesson {
	public static void main(String[] args) {
		String s = "Java";
		if(s.matches("Java")) {
			System.out.println("Match!");
		}
		if(s.matches("J.va")) {
			System.out.println("Match!");
		}
		if("jaaaaaaaava".matches("Ja*va")) {//*は直前の文字の０回以上の繰り返し
			System.out.println("Match!");
		}
		if("あいうxx019".matches(".*")) {
			System.out.println("Match!");
		}
		if("url".matches("[a-z]{3}")) {
			System.out.println("Match!");
		}
		s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w : words) {
			System.out.print(w+"->");
			}
		String w = s.replaceAll("[beh]","x");
		System.out.println(w);//aXc,dXf:gXi
		Method();
		int sum = sumOf(3,6,8);
		System.out.println(sum);
		sum = sumOf(1);
		}

	//可変長引数
	public static void Method(int...args) {
		for(int i:args) {
			System.out.println(i);
		}
	}
	public static int sumOf(int n,int ...args) {
		int sum = n;
		for(int i:args) {
			sum+=i;
		}
		return sum;
	}
	}

