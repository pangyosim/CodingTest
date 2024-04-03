import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int h = 0;
		int k = 0;
		for(int i=0; i<2*n-1;i++) {
			for(int j=0;j<n+k+1;j++) {
				if(j == n+k) {
					System.out.println();
				} else if (((i==h)&&((j>=n-k-1)&&(j<=n+k-1))) ) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			if(i <= n-2) {
				k++;
				h++;
			} else {
				k--;
				h++;
			}
		}
		br.close();
	}

}
