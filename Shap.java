package com.workfoura;

import java.util.Scanner;

//Trangle��
class Trangle {
	// ����
	double fside, secside, tside;
	double s, c;
	boolean flag;

	// ����һ������
	public Trangle(double a, double b, double c) {
		fside = a;
		secside = b;
		tside = c;
		// �жϲ����Ƿ���Թ���������
		if (a + b > c && a + c > b && c + b > a) {
			flag = true;
		} else {
			flag = false;
			System.out.println("�����߲��ܹ��������Σ�");
		}
	}

//���췽�������ܳ�
	double getc() {
		if (flag) {
			c = fside + secside + tside;
			return c;
		} else {
			return 0;
		}
	}

//���췽���������
	double gets() {
		double p = (fside + secside + tside) / 2;
		s = Math.sqrt(p * (p - fside) * (p - secside) * (p - tside));
		return s;
	}
}

//Lader��
class Lader {
	double uplength, blength, hight, s;

//���췽��
	public Lader(double x, double y, double z) {
		uplength = x;
		blength = y;
		hight = z;
	}

//���췽���������
	double gets() {
		s = (uplength + blength) * hight / 2;
		return s;
	}
}

//Circle��
class Circle {
	double r, c, s;

//���������ò���
	public Circle(double R) {
		r = R;
	}

//���췽�������ܳ�
	double getc() {
		c = 2 * 3.1415926 * r;
		return c;
	}

//���췽���������
	double gets() {
		s = 3.1415926 * r * r;
		return s;
	}
}

//����Shap
public class Shap {
	// main����
	public static void main(String args[]) {
		Scanner m = new Scanner(System.in);
		// Trangle��
		// ��ʾ����������
		System.out.println("�����������ε������ߣ�");
		double x = m.nextDouble();
		double y = m.nextDouble();
		double z = m.nextDouble();
		// ʵ����һ��Trangle��Ķ���
		Trangle trangle = new Trangle(x, y, z);
		// ���÷��������ܳ������
		System.out.println("�����ε��ܳ�Ϊ��" + trangle.getc());
		System.out.println("�����ε����Ϊ��" + trangle.gets());
		// ��ʾ�޸�������
		System.out.println("���޸������ε������ߣ�");
		x = m.nextDouble();
		y = m.nextDouble();
		z = m.nextDouble();
		Trangle tranglee = new Trangle(x, y, z);
		System.out.println("�����ε��ܳ�Ϊ��" + tranglee.getc());
		System.out.println("�����ε����Ϊ��" + tranglee.gets());
		// Lader��
		// ��ʾ�����ϵס��µ׺͸ߵĳ���
		System.out.println("�����������ϵס��µ׺͸ߣ�");
		double uplen = m.nextDouble();
		double blen = m.nextDouble();
		double hight = m.nextDouble();
		// ʵ����һ������
		Lader lader = new Lader(uplen, blen, hight);
		// ���÷����������
		System.out.println("���ε����Ϊ��" + lader.gets());
		// Circle��
		// ��ʾ����뾶
		System.out.println("������Բ�εİ뾶��");
		double r = m.nextDouble();
		// ʵ����һ������
		Circle circle = new Circle(r);
		// ���÷��������ܳ������
		System.out.println("Բ�ε��ܳ�Ϊ��" + circle.getc());
		System.out.println("Բ�ε����Ϊ��" + circle.gets());
	}

}
