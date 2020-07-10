package test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("2");
		s.add("2");
		s.add("3");
		System.out.println(s);
	}
}
