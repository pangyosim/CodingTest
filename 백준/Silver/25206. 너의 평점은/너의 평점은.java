import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Double> gradeMap = new HashMap<String,Double>(){{
			put("A+",4.5);
			put("A0",4.0);
			put("B+",3.5);
			put("B0",3.0);
			put("C+",2.5);
			put("C0",2.0);
			put("D+",1.5);
			put("D0",1.0);
			put("F",0.0);
		}};
		double gradesum = 0;
		double sum = 0;
		for(int i=0;i<20;i++) {
			String str = br.readLine();
			double num = Double.parseDouble(str.split(" ")[1]);
			String grade = str.split(" ")[2];
			if (!grade.equals("P")) {
				sum += num * gradeMap.get(grade);
				gradesum += num;
			}
		}
		System.out.println(sum/gradesum);
		br.close();
	}

}
