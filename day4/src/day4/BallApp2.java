package day4;

public class BallApp2 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("R G B");
		for(int i=0; i<n+1; i++) {
			int rCount = i;
			for(int j=i+1; j<n+2; j++) {
				int gCount = j-rCount-1;
				int bCount = n-rCount-gCount;
				System.out.printf("[%d,%d,%d]", rCount,gCount,bCount);
				System.out.println();
			}
		}

	}

}
