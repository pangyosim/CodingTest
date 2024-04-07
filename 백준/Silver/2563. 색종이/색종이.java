import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] map = new boolean[101][101];
		int tot = 0;
		for(int k=0;k<n;k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			for(int l=s;l<s+10;l++) {
				for(int o=e;o<e+10;o++) {
					map[l][o] = true;
				}
			}
		}
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j]==true) {
					tot++;
				}
			}
		}
		System.out.println(tot);
		br.close();
	}

}
