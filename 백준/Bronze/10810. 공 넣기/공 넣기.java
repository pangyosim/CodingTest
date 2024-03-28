import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] answer = new int[N];
		int[] ijk = new int[3];
		
		for(int i=0;i<M;i++) {
			ijk[0]=sc.nextInt();
			ijk[1]=sc.nextInt();
			ijk[2]=sc.nextInt();

			for(int j=ijk[0]-1;j<ijk[1];j++) {
				answer[j] = ijk[2];
			}
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
		
		
		sc.close();
	}

}
