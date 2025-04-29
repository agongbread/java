package com.workfoura;

import java.util.Scanner;

public class Rectangle {
	// 变量
	double width;
	double length;
	double c;
	double s;

	// 构建一个方法
	public Rectangle(double w, double len) {
		// 设置相关参数
		this.width = w;
		this.length = len;
	}

	// 构建一个方法，计算周长
	public double getc() {
		c = (length + width) * 2;
		return c;
	}
//构建一个方法，计算面积
	public double gets() {
		s = width * length;
		return s;
	}
//main方法
	public static void main(String args[]) {
		// 实例化Scanner类
		Scanner m = new Scanner(System.in);
		// 得到输入的长和宽
		System.out.println("请输入长方形的长：");
		double length = m.nextDouble();
		System.out.println("请输入长方形的宽：");
		double width = m.nextDouble();
		// 实例化一个对象
		Rectangle n = new Rectangle(width, length);
		// 输出调用方法得到的面积和周长
		System.out.println("得到长方形的面积为：" + n.gets());
		System.out.println("得到长方形的周长为：" + n.getc());
	}
}
