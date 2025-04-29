package com.workfoura;

import java.util.Scanner;

//Trangle类
class Trangle {
	// 变量
	double fside, secside, tside;
	double s, c;
	boolean flag;

	// 构造一个方法
	public Trangle(double a, double b, double c) {
		fside = a;
		secside = b;
		tside = c;
		// 判断参数是否可以构成三角形
		if (a + b > c && a + c > b && c + b > a) {
			flag = true;
		} else {
			flag = false;
			System.out.println("三条边不能构成三角形！");
		}
	}

//构造方法计算周长
	double getc() {
		if (flag) {
			c = fside + secside + tside;
			return c;
		} else {
			return 0;
		}
	}

//构造方法计算面积
	double gets() {
		double p = (fside + secside + tside) / 2;
		s = Math.sqrt(p * (p - fside) * (p - secside) * (p - tside));
		return s;
	}
}

//Lader类
class Lader {
	double uplength, blength, hight, s;

//构造方法
	public Lader(double x, double y, double z) {
		uplength = x;
		blength = y;
		hight = z;
	}

//构造方法计算面积
	double gets() {
		s = (uplength + blength) * hight / 2;
		return s;
	}
}

//Circle类
class Circle {
	double r, c, s;

//方法，设置参数
	public Circle(double R) {
		r = R;
	}

//构造方法计算周长
	double getc() {
		c = 2 * 3.1415926 * r;
		return c;
	}

//构造方法计算面积
	double gets() {
		s = 3.1415926 * r * r;
		return s;
	}
}

//主类Shap
public class Shap {
	// main方法
	public static void main(String args[]) {
		Scanner m = new Scanner(System.in);
		// Trangle类
		// 提示输入三条边
		System.out.println("请输入三角形的三条边：");
		double x = m.nextDouble();
		double y = m.nextDouble();
		double z = m.nextDouble();
		// 实例化一个Trangle类的对象
		Trangle trangle = new Trangle(x, y, z);
		// 调用方法计算周长和面积
		System.out.println("三角形的周长为：" + trangle.getc());
		System.out.println("三角形的面积为：" + trangle.gets());
		// 提示修改三条边
		System.out.println("请修改三角形的三条边：");
		x = m.nextDouble();
		y = m.nextDouble();
		z = m.nextDouble();
		Trangle tranglee = new Trangle(x, y, z);
		System.out.println("三角形的周长为：" + tranglee.getc());
		System.out.println("三角形的面积为：" + tranglee.gets());
		// Lader类
		// 提示输入上底、下底和高的长度
		System.out.println("请依次输入上底、下底和高：");
		double uplen = m.nextDouble();
		double blen = m.nextDouble();
		double hight = m.nextDouble();
		// 实例化一个对象
		Lader lader = new Lader(uplen, blen, hight);
		// 调用方法计算面积
		System.out.println("梯形的面积为：" + lader.gets());
		// Circle类
		// 提示输入半径
		System.out.println("请输入圆形的半径：");
		double r = m.nextDouble();
		// 实例化一个对象
		Circle circle = new Circle(r);
		// 调用方法计算周长和面积
		System.out.println("圆形的周长为：" + circle.getc());
		System.out.println("圆形的面积为：" + circle.gets());
	}

}
