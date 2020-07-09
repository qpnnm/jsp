package sss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("이름", "박경훈");
		map.put("주소", "강서구");
		map.put("별칭", "선생님");
		map.put("나이", 38.7);
		map.put("오늘 식사", "없음");
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + "   : " + map.get(key));
		}
	}
}
