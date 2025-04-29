package com.workfoura;

//创建类Person
class Person {
	int weight;

	// Person类的构造方法
	Person() {
		weight = 50;
	}

	// Person类下构建方法
	void printPerson() {
		System.out.println("Person.printPerson()");
	}
}

//创建Person的子类ZhangSan类
class ZhangSan extends Person {
	int weight;

	// ZhangSan类的构造方法
	ZhangSan() {
		super();
		weight = 500;
	}

	// 重写Person类的方法
	void printPerson() {
		System.out.println("ZhangSan.printPerson()");
	}

	// 构造方法，演示super和this的用法
	void superThisUseDemo() {
		int weight;
		weight = 5000;
		// 调用Person类的printPerson方法
		super.printPerson();
		// 调用ZhangSan类的printPerson方法
		printPerson();
		// 显示Person类的weight
		System.out.println("super.weight=" + super.weight);
		// 显示ZhangSan类的weight
		System.out.println("this.weight=" + this.weight);
		System.out.println("weight=" + weight);
	}
}

public class SuperThisUseDemo {
	public static void main(String args[]) {
		ZhangSan zhangsan = new ZhangSan();
		zhangsan.superThisUseDemo();
	}

}
