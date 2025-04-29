package com.workfoura;

//������Person
class Person {
	int weight;

	// Person��Ĺ��췽��
	Person() {
		weight = 50;
	}

	// Person���¹�������
	void printPerson() {
		System.out.println("Person.printPerson()");
	}
}

//����Person������ZhangSan��
class ZhangSan extends Person {
	int weight;

	// ZhangSan��Ĺ��췽��
	ZhangSan() {
		super();
		weight = 500;
	}

	// ��дPerson��ķ���
	void printPerson() {
		System.out.println("ZhangSan.printPerson()");
	}

	// ���췽������ʾsuper��this���÷�
	void superThisUseDemo() {
		int weight;
		weight = 5000;
		// ����Person���printPerson����
		super.printPerson();
		// ����ZhangSan���printPerson����
		printPerson();
		// ��ʾPerson���weight
		System.out.println("super.weight=" + super.weight);
		// ��ʾZhangSan���weight
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
