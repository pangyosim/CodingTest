import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> Attendance = new ArrayList<>();
		for(int i=1;i<=30;i++) {
			Attendance.add(Integer.toString(i));
		}
		for(int i=0;i<28;i++) {
			int person = sc.nextInt();
			Attendance.remove(Integer.toString(person));
		}
		for(int i=0;i<Attendance.size();i++) {
			System.out.println(Integer.parseInt(Attendance.get(i)));
		}
		sc.close();
	}

}
