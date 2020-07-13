package sss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest_3 {
public static void main(String[]args) {
	Map<String,Object> m = new HashMap<>();
	m.put("이름", "정원영");
	m.put("나이", 77);
	m.put("별칭", "내가 곧임");
	Iterator<String> it = m.keySet().iterator();
	while(it.hasNext()) {
		String key = it.next()	;
		System.out.println(key+ " =="+ m.get(key));
	}
	
	
}
}
