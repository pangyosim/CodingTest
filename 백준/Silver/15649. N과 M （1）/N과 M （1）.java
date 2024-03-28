import java.util.Scanner;

public class Main {
	
	public static int[] arr;
	public static boolean[] check;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		arr=new int[M];
		check=new boolean[N];
		func_print(N,M,0);
		scan.close();
	}

	public static void func_print(int N, int M, int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int j = 0; j < N; j++) {
			if (!check[j]) {
				check[j] = true;
				arr[depth] = j + 1;
				func_print(N, M, depth + 1);
				check[j] = false;
			}
		}
	}
}
