package org.gitHub;

public class TestPgms { 
    static int i=9;
public  void m1() {
	  System.out.println(i);
}
public static void m2() {
	  System.out.println(i);
}
public static void main(String[] args) {
	TestPgms  t= new TestPgms ();
	t.m1();
	t.m2();
}
}

