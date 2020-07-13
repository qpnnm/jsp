package sss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String, Object> lc = new HashMap<>();
		lc.put("name", "애쉬");
		lc.put("power", 30);
		lc.put("defense", 50);
		lc.put("level", 10);
		lc.put("speed", 300);
		System.out.println(lc);
		Iterator<String> it = lc.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + lc.get(key));
		}
	}
}
