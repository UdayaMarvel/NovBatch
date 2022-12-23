package org.gitHub;

public class GitClass {                                                                                                                                                                                                                                                           
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		
		for (int i=0; i <a.length; i++) {
			sum = sum + a[i];
			
			
		}
		System.out.println("sum = "+sum);
		double avg = sum / 10;
		System.out.println(avg);
		// TODO Auto-generated method stub

	}

}
