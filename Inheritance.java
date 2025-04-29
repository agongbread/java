package com.workfourb;
import java.io.*;
//父类SuperClass
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

//子类SubClass
class SubClass extends SuperClass {
	int x;

	SubClass() {
//调用父类的构造方法
		super();
//super（）要放在方法中的第一位
		x = 5;
		System.out.println("in SubClass:x=" + x);
	}

	void doSomething() {
//调用父类的方法
		super.doSomething();
		System.out.println("in SubClass.doSomething()");
		System.out.println("super.x=" + super.x + "sub.x=" + x);
	}
}

//主方法
public class Inheritance {
	public static void main(String[] args) {
		SubClass subC = new SubClass();
		subC.doSomething();

	}
}
