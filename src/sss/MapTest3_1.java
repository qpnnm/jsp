package sss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3_1 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("나이", 24);
		m.put("나이", 35);
		m.put("나이", 21);
		m.put("나이", 26);
		m.put("나이", null);
		Iterator<String> it = m.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next()	;
			System.out.println(key + "  =  "   + m.get(key));
			
		}

	}
}
