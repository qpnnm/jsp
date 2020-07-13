package sss;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("age", 10);
		for (int a = m.get("age"); a <= 50; a++) {
			int sum = m.get("age") + a;
			m.put("age", sum);
		}System.out.println(m);
	}
}
