import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String val = "";
		for(int i=0;i<str.length();i++) {
			val += str.charAt(str.length()-1-i);
		}
		System.out.println(str.equals(val) ? 1 : 0);
		br.close();
	}

}
