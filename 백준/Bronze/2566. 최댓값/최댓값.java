import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int max_xidx = 0;
		int max_yidx = 0;
		for(int x=0;x<9;x++) {
			int y = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				if( max <= num) {
					max = num;
					max_yidx = y+1;
					max_xidx = x+1;
				}
				y++;
			}
		}
		System.out.println(max);
		System.out.println(max_xidx + " " + max_yidx);
		br.close();
	}

}
