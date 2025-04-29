package com.workfourb;

import java.util.Scanner;

//�������Shape
abstract class Shape {
	// ������󷽷�Area
	public abstract double Area();

	// ������󷽷�printArea
	public abstract void printArea();
}

//������Rectangle�̳�Shape��
class Rectangle extends Shape {
	double width;
	double length;

	// ��Ĺ��췽��
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	// ���췽���������
	public double Area() {
		return width * length;
	}

	// ���췽����ӡ�����
	public void printArea() {
		System.out.println("���ε����Ϊ��" + Area());
	}

}

//����Circle��̳�Shape
class Circle extends Shape {
	double r;

	// ��Ĺ��췽��
	public Circle(double r) {
		this.r = r;
	}

	// ���췽������Բ�����
	public double Area() {
		return 3.14 * r * r;
	}

	// ���췽����ӡԲ�����
	public void printArea() {
		System.out.println("Բ�ε����Ϊ��" + Area());
	}
}

// public��
public class Try {
	// main����
	public static void main(String args[]) {
		// ������εĳ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������εĿ�");
		double width = scanner.nextDouble();
		System.out.println("��������εĳ���");
		double length = scanner.nextDouble();
		Rectangle rec = new Rectangle(width, length);
		// ���÷������㲢��ӡ���
		rec.printArea();
		// ��ʾ����Բ�İ뾶
		System.out.println("������Բ�İ뾶");
		double r = scanner.nextDouble();
		Circle circle = new Circle(r);
		// ���÷�����ӡ���
		circle.printArea();

	}

}

