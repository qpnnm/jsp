package sss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import s0625.Student;

class LOLChamp {
	private String name;
	private int power;

	public String toString() {
		return "LOLChamp      [name=" + name + ", power=" + power + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}

public class ListTest3 {
	public static void main(String[] args) {
		String[] names = { "티모", "나미", "람머스", "나무", "징크스", "애쉬" };
		List<LOLChamp> lcList = new ArrayList<>();
		Random r = new Random();
		LOLChamp lc;
		for (int i = 0; i < names.length; i++) {
			lc = new LOLChamp();
			lc.setName(names[i]);
			lc.setPower(r.nextInt(51) + 50);
			lcList.add(lc);
		}
		int max = 0;
		int idx = 0;
		for (int i = 0; i < names.length; i++) {
			lc = lcList.get(i);
			System.out.println(lc);
			if (max < lc.getPower()) {
				max = lc.getPower();
				idx = i;
			}
		}
		System.out.println("THE MOST STRONG" + lcList.get(idx));
	}
}