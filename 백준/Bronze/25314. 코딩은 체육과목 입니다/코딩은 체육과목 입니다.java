import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int N = sc.nextInt();
		for (int i=0;i<N/4;i++) {
			str+="long ";
		}
		System.out.print(str + "int");
		sc.close();

	}

}
