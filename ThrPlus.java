package com.workfoura;

//����ʹ��Scanner
import java.util.Scanner;

public class ThrPlus {
	// ����һ��plus���������������������
	public static int plus(int a, int b) {
		return a + b;
	}

	// ���أ����������������
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}

	// �ٴ����أ������ĸ��������
	public static int plus(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	// main����
	public static void main(String args[]) {
		Scanner m = new Scanner(System.in);
		System.out.println("������4������ӵ����֣�");
		int x = m.nextInt();
		int y = m.nextInt();
		int z = m.nextInt();
		int p = m.nextInt();
		// ���÷�����ʵ�ֲ�ͬλ������ӵĹ���
		System.out.println("����������ӣ�a+b=" + plus(x, y));
		System.out.println("����������ӣ�a+b+c=" + plus(x, y, z));
		System.out.println("�ĸ�������ӣ�a+b+c+d=" + plus(x, y, z, p));
	}
}
