package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("4", "4");
		map.put("3", "4");
		map.put("2", "4");
		map.put("1", "4");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " == " + map.get(key));
		}
	}
}
