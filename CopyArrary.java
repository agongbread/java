package com.workfoura;

import java.util.Arrays;

public class CopyArrary {

	public static void main(String arg[]) {

		int a[] = { 11, 89, 23, 45, 36, 74, 35, 88, 4, 6 };
		int b[] = { 28, 34, 67, 2, 8, 4, 6, 76, 56, 24 };
		int c[] = { 23, 34, 56, 37, 45, 99, 0, 0, 0, 0 };
		// ��arraycopy()��������
		System.arraycopy(a, 0, c, 0, a.length);
		System.out.println("��������a�����ݲ������");
		// foreach���
		for (int x : c) {
			System.out.print(x + " ");
		}
		// ��copyOf()��������
		c = Arrays.copyOf(b, b.length);
		System.out.println("");
		System.out.println("��������b�����ݲ������");
		// foreach���
		for (int y : c) {
			System.out.print(y + " ");
		}
	}
}
