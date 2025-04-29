package com.workfourb;
import java.io.*;
//����SuperClass
class SuperClass {
	int x;
	SuperClass() {
		x = 3;
		System.out.println("in SuperClass:x=" + x);
}

	void doSomething() {
		System.out.println("in SuperClass.doSomething()");
	}
}

//����SubClass
class SubClass extends SuperClass {
	int x;

	SubClass() {
//���ø���Ĺ��췽��
		super();
//super����Ҫ���ڷ����еĵ�һλ
		x = 5;
		System.out.println("in SubClass:x=" + x);
	}

	void doSomething() {
//���ø���ķ���
		super.doSomething();
		System.out.println("in SubClass.doSomething()");
		System.out.println("super.x=" + super.x + "sub.x=" + x);
	}
}

//������
public class Inheritance {
	public static void main(String[] args) {
		SubClass subC = new SubClass();
		subC.doSomething();

	}
}
