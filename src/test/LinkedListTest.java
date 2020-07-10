package test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
public static void main(String[] args) {
	List<String>strList = new LinkedList<>();
	strList.add("1");
	strList.add("2");
	strList.add("3");
	strList.add("4");
	for(int i=0;i<strList.size();i++) {
		System.out.println(strList.get(i));
	}
}
}
