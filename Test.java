package com.workfourb;

class A {
	int sum, num1, num2;
//A类的构造方法
	public A() {
		num1 = 10;
		num2 = 20;
		sum = 0;
	}

//构造sum1方法 得到num1、num2的和
	void sum1() {
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}

//构造sum2方法 得到num1(参数n)、num2的和
	void sum2(int n) {
		num1 = n;
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}
}

//构造子类B继承父类A
class B extends A {
	int num2;
//B类的构造方法
	public B() {
		num2 = 200;
	}

//无参数的sum2方法
	void sum2() {
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}

//有参数的sum2方法
	void sum2(int n) {
		num1 = n;
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}

//构造sum3方法
	void sum3(int n) {
		//调用了父类的sum2方法
		super.sum2(n);
		//输出当前区域的sum
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}
}

class Test {
	public static void main(String[] args) {
		B m = new B();
		m.sum1();
		m.sum2();
		m.sum2(50);
		m.sum3(50);
	}
}
