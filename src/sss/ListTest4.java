package sss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListTest4 {
	public static void main(String[] args) {
		String[] fNames = { "김", "이", "박", "최", "조", "맹", "신" };
		String[] lNames = { "동동", "나나", "진수", "명희", "철수", "명호", "둘리" };
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 1; i <= 20; i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName + lName);
			s.setGrade(r.nextInt(3) + 1);
			stList.add(s);
		}
		int[] nums = new int[3];
		List<Student> oneList = new ArrayList<>();
		List<Student> twoList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();
		for (Student s : stList) {
			System.out.println(s);

			if (s.getGrade() == 1) {
				oneList.add(s);// fNum++;
			} else if (s.getGrade() == 2) {
				twoList.add(s); // sNum++;
			} else if (s.getGrade() == 3) {
				threeList.add(s); // tNum++;
			} else {
				System.out.println("없는 학년입니다.");
			}
			
		}
		if(oneList.size()>0) {
			System.out.println("1학년:"+oneList.size()+"명");
			for(Student st: oneList) {
				System.out.print(st.getName()+",");
			}
			System.out.println();
		}
		if(twoList.size()>0) {
			System.out.println("2학년:"+twoList.size()+"명");
			for(Student st: twoList) {
				System.out.print(st.getName()+",");
			}
			System.out.println();
		}
		if(threeList.size()>0) {
			System.out.println("3학년:"+threeList.size()+"명");
			for(Student st: threeList) {
				System.out.print(st.getName()+",");
			}
			System.out.println();
		}
	}
}
//			for (int i = 0; i < nums.length; i++) {
//				if (s.getGrade() == (i + 1)) {
//					nums[i]++;
//				}
//			}
//		}
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				System.out.println((i + 1) + "학년" + nums[i] + "명이다." );
//			}
//
//		}

//				int fNum = 0;
//				int sNum = 0;
//				int tNum = 0;

//			System.out.println(s);
//			// 위의 리스트는 1- 3학년까지 랜덤하게 들어간 리스트 입니다.
//			// 학년별로 몇영이 있는지 출력하세요.

//		if (fNum != 0) {
//			System.out.println("1학년은" + fNum + "명입니다");
//		}
//		if (sNum != 0) {
//			System.out.println("2학년은" + sNum + "명입니다");
//		}
//		if (tNum != 0) {
//			System.out.println("3학년은" + tNum + "명입니다");
