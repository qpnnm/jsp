package sss;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test_ {
public static void main(String[] args) throws SQLException  {
	List<String>strList = new ArrayList<>();
	strList.add("1");
	strList.add("3");
	strList.add("4");
	System.out.println(strList.size());
	
	Map<Integer,String>map = new HashMap<>();
	map.put(4,"1");
	map.put(3,"3");
	map.put(10, "4");
	Iterator<Integer> keys = map.keySet().iterator()	;
	while(keys.hasNext()) {
		Integer key = keys.next()	;
		String value = map.get(key);
		System.out.println(key+","+value);
	}
}
}
