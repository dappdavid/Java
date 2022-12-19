package com.java.playground;

public class Programming1 {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "xyz";
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
			
	}
}
