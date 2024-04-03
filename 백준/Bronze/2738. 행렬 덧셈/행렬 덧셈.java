import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] answer = new int[N][M];
		for(int i=0;i<2*N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				answer[i%N][j] += Integer.parseInt(st.nextToken());
			}
		}
		for(int[] arr : answer) {
			for(int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		br.close();
	}

}
