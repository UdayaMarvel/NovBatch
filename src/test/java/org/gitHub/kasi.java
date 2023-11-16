package org.gitHub;

public class kasi {
	public static void main(String args[]) {
		String s ="Welcome to git class";
		String reverse ="";
		
		char[] ct = s.toCharArray();
		
		
		for(int i=ct.length-1;i>=0;i--) {
			char cr = ct[i];
			reverse = reverse+cr;
		}
		System.out.println(reverse);
	}

}
