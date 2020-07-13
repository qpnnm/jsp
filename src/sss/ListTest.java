package sss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			Student st = new Student();
			st.setName("루이" + i + "세");
			st.setGrade(r.nextInt(10) + 1);
			stList.add(st);
		}
		for (int i = 0; i < stList.size(); i++) {
			if (i % 2 ==1 ) {
				System.out.print("이름:" + stList.get(i).getName());
				System.out.println("학년:" + stList.get(i).getGrade());
			}
		}
	}
}
