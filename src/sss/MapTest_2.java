package sss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest_2 {
	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<>();
		m.put("차종", "준대형");
		m.put("제조사", "HYUNDAI");
		m.put("명칭", "제네시스");
		m.put("배기량", 3300);
		m.put("가격", "6000만원");
		Iterator<String> it = m.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
                 System.out.println(key+ " ==  " + m.get(key));
		}
	}
}
