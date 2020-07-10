package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest_4 {
	public static void main(String[] args) {
		Map<String, String[]> param = new HashMap<>();
		String[]strs = new String[1];
		strs[0]="1";
		param.put("name",strs);
	}

}
