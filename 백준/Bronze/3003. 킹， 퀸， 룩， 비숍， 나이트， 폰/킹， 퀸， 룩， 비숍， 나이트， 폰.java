import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> var = new ArrayList<>(Arrays.asList(1,1,2,2,2,8));
		String[] arr = br.readLine().split(" ");
		int idx = 0;
		for(String a : arr) {
			System.out.print(var.get(idx++)-Integer.parseInt(a)+ " ");
		}
		br.close();
	}

}
