import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		// 인덱스+1 값으로 array 초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int j=0;j<M;j++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			for(int k=0;k<end-start;k++) {
				if( (start+k-1) <= (end-k-1)) {
					int tmp = arr[start+k-1];
					arr[start+k-1] = arr[end-k-1];
					arr[end-k-1]=tmp;
				} else {
					break;
				}
			}
		}
		for(int a : arr) {
			System.out.print(a +" ");
		}
		br.close();
	}
}
