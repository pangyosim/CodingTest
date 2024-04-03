import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		String[] arr = new String[15];
		Arrays.fill(arr, "");
		for(int i=0;i<5;i++) {
			String str = br.readLine();
			int idx = 0;
			while(idx < str.length()) {
				arr[idx] += str.charAt(idx);
				idx++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			answer+=arr[j];
		}
		System.out.println(answer);
		br.close();
	}

}
