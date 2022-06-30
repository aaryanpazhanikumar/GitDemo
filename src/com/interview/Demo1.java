package com.interview;

public class Demo1 {
	
	public static void main(String[] args) {
	
		
		String s = "Welcome!@&#Aboard123";
		
		int upperCase = 0, lowerCase = 0, numbers = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)>=64 && s.charAt(i)<91) {
				
				upperCase++;
			}
			else if (s.charAt(i)>96   &&  s.charAt(i)<122) {
				
				lowerCase++;
				
			}
			else if (s.charAt(i)>48 && s.charAt(i)<57) {
				
				numbers++;
				
			}
		
	}
		System.out.println("upper case value:" + upperCase);
		System.out.println("lower case value:" + lowerCase);
		System.out.println("number values:" +numbers);

}
	
}
