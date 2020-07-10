package sss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest4 {
	public static void main(String[] args) {
		Map<String,Object> m  = new HashMap <>();
		m.put("이름" ,"ㅋㅋ");
		m.put("나이",14);
		m.put("직업", "stdudent");
		Iterator<String> it = m.keySet().iterator()	;
		while(it.hasNext()) {
			String key = it.next()	;
			System.out.println(key + "   :   " + m.get(key));
		}
	}
}
