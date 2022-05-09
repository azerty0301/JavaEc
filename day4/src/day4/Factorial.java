package day4;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.print(factorial1(10));
	}

	static int factorial(int n) {
		int ans = n;
		for (int i = 0; i < n - 1; i++) {
			ans = ans * (n - 1 - i);
		}

		return ans;
	}

	//recursive(再帰処理)
	static int factorial1(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorial(n - 1);
	}





}


