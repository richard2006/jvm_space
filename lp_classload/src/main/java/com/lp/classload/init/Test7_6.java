package com.lp.classload.init;
/**
 * ＜clinit＞（）方法与类的构造函数（或者说实例构造器＜init＞（）方法）不同，它不需要显式地调用父类构造器，
 * 虚拟机会保证在子类的＜clinit＞（）方法执行之前，父类的＜clinit＞（）方法已经执行完毕。
 * 因此在虚拟机中第一个被执行的＜clinit＞（）方法的类肯定是java.lang.Object。
 * @author Administrator
 *
 */
public class Test7_6{
	public static void main(String[] args) {
		/* 由于父类的＜clinit＞（）方法先执行，也就意味着父类中定义的静态语句块要优先于子类的变量赋值操作，
		 * 如在【代码清单】7-6中，字段B的值将会是2而不是1。
		 */
		System.out.println(Sub.B);
	}
}
 class Parent {
	public static int A=1;
	static{
		A=2;
	}
}
 class Sub extends Parent{
	public static int B=A;
}
