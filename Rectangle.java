package com.workfoura;

import java.util.Scanner;

public class Rectangle {
	// ����
	double width;
	double length;
	double c;
	double s;

	// ����һ������
	public Rectangle(double w, double len) {
		// ������ز���
		this.width = w;
		this.length = len;
	}

	// ����һ�������������ܳ�
	public double getc() {
		c = (length + width) * 2;
		return c;
	}
//����һ���������������
	public double gets() {
		s = width * length;
		return s;
	}
//main����
	public static void main(String args[]) {
		// ʵ����Scanner��
		Scanner m = new Scanner(System.in);
		// �õ�����ĳ��Ϳ�
		System.out.println("�����볤���εĳ���");
		double length = m.nextDouble();
		System.out.println("�����볤���εĿ�");
		double width = m.nextDouble();
		// ʵ����һ������
		Rectangle n = new Rectangle(width, length);
		// ������÷����õ���������ܳ�
		System.out.println("�õ������ε����Ϊ��" + n.gets());
		System.out.println("�õ������ε��ܳ�Ϊ��" + n.getc());
	}
}
