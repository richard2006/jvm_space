package com.lp.classload.init;
/**
 * ��clinit��������������Ĺ��캯��������˵ʵ����������init��������������ͬ��������Ҫ��ʽ�ص��ø��๹������
 * ������ᱣ֤������ģ�clinit����������ִ��֮ǰ������ģ�clinit�����������Ѿ�ִ����ϡ�
 * �����������е�һ����ִ�еģ�clinit��������������϶���java.lang.Object��
 * @author Administrator
 *
 */
public class Test7_6{
	public static void main(String[] args) {
		/* ���ڸ���ģ�clinit������������ִ�У�Ҳ����ζ�Ÿ����ж���ľ�̬����Ҫ����������ı�����ֵ������
		 * ���ڡ������嵥��7-6�У��ֶ�B��ֵ������2������1��
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
