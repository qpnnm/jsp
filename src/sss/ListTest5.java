package sss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food {
	private String name;
	private int price;
	private String locale;

	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}
}

public class ListTest5 {
	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = { "한식", "양식", "중식", "일식", "분식", "경양식" };
		List<String> strList = new ArrayList<>();
		int[] cnts = new int[locales.length];
		Random r = new Random();
		for (int i = 1; i <= 30; i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10) + 1) * 1000);
			fList.add(f);

		}
		Food maxF = fList.get(0);
		Food minF = fList.get(0);

		for (int i = 0; i < 30; i++) {
			Food f = fList.get(i);
			if (maxF.getPrice() < f.getPrice()) {
				maxF = f;
			}
			if (minF.getPrice() > f.getPrice()) {
				minF = f;
			}

		}

		List<Food> MaxfList = new ArrayList<>();
		List<Food> MinfList = new ArrayList<>();
		for (int i = 0; i < fList.size(); i++) {
			Food f = fList.get(i);
			if (maxF.getPrice() == f.getPrice()) {
				MaxfList.add(f);
			}
			if (minF.getPrice() == f.getPrice()) {
				MinfList.add(f);
			}
		}
		for (int i = 0; i < 30; i++) {
			int idx = (r.nextInt(locales.length));
			strList.add(locales[idx]);
		}
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < locales.length; j++) {
				if (strList.get(i).equals(locales[j])) {
					cnts[j]++;
				}
			}
		}
		for (int j = 0; j < locales.length; j++) {
			System.out.println(locales[j] + "갯수" + cnts[j]);
		}
		System.out.println();
		System.out.println("제일 비싼 음식 가격:" + maxF.getPrice() + "\n제일비싼 음식 갯수" + MaxfList.size() + "\n" + MaxfList);
		System.out.println();
		System.out.println("제일 싼 음식 가격:" + minF.getPrice() + "\n제일싼 음식 갯수" + MinfList.size() + "\n" + MinfList);
	}
}