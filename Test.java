package com.workfourb;

class A {
	int sum, num1, num2;
//A��Ĺ��췽��
	public A() {
		num1 = 10;
		num2 = 20;
		sum = 0;
	}

//����sum1���� �õ�num1��num2�ĺ�
	void sum1() {
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}

//����sum2���� �õ�num1(����n)��num2�ĺ�
	void sum2(int n) {
		num1 = n;
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}
}

//��������B�̳и���A
class B extends A {
	int num2;
//B��Ĺ��췽��
	public B() {
		num2 = 200;
	}

//�޲�����sum2����
	void sum2() {
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}

//�в�����sum2����
	void sum2(int n) {
		num1 = n;
		sum = num1 + num2;
		System.out.println("sum=" + num1 + "+" + num2 + "=" + sum);
	}

//����sum3����
	void sum3(int n) {
		//�����˸����sum2����
		super.sum2(n);
		//�����ǰ�����sum
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
