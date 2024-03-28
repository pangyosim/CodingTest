import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] sw = new int[2];
		int[] answer = new int[N];
		int tmp = 0;
		// 1~N개 바구니 값 입력
		for(int i=0;i<answer.length;i++) {
			answer[i]=i+1;
		}
		
		// N개 바구니 값 바꾸는 부분
		for(int i=0;i<M;i++) {
			sw[0]=sc.nextInt()-1;
			sw[1]=sc.nextInt()-1;
			tmp = answer[sw[0]];
			answer[sw[0]]=answer[sw[1]];
			answer[sw[1]] = tmp;
		}
		
		// 출력
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
		sc.close();
	}

}
