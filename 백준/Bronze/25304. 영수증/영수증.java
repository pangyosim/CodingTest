import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int n = sc.nextInt();
		int a, b;
		int sum = 0;
		for (int i=0;i<n;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += a*b;
		}
		if (sum == x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();

	}

}