package com.workfoura;

//便于使用Scanner
import java.util.Scanner;

public class ThrPlus {
	// 创建一个plus方法，计算两个数字相加
	public static int plus(int a, int b) {
		return a + b;
	}

	// 重载，计算三个数字相加
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}

	// 再次重载，计算四个数字相加
	public static int plus(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	// main方法
	public static void main(String args[]) {
		Scanner m = new Scanner(System.in);
		System.out.println("请输入4个待相加的数字：");
		int x = m.nextInt();
		int y = m.nextInt();
		int z = m.nextInt();
		int p = m.nextInt();
		// 调用方法，实现不同位数字相加的功能
		System.out.println("两个数字相加，a+b=" + plus(x, y));
		System.out.println("三个数字相加，a+b+c=" + plus(x, y, z));
		System.out.println("四个数字相加，a+b+c+d=" + plus(x, y, z, p));
	}
}
