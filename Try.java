package com.workfourb;

import java.util.Scanner;

//构造抽象Shape
abstract class Shape {
	// 构造抽象方法Area
	public abstract double Area();

	// 构造抽象方法printArea
	public abstract void printArea();
}

//构造类Rectangle继承Shape类
class Rectangle extends Shape {
	double width;
	double length;

	// 类的构造方法
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	// 构造方法计算面积
	public double Area() {
		return width * length;
	}

	// 构造方法打印出面积
	public void printArea() {
		System.out.println("矩形的面积为：" + Area());
	}

}

//构造Circle类继承Shape
class Circle extends Shape {
	double r;

	// 类的构造方法
	public Circle(double r) {
		this.r = r;
	}

	// 构造方法计算圆的面积
	public double Area() {
		return 3.14 * r * r;
	}

	// 构造方法打印圆的面积
	public void printArea() {
		System.out.println("圆形的面积为：" + Area());
	}
}

// public类
public class Try {
	// main方法
	public static void main(String args[]) {
		// 输入矩形的长宽
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入矩形的宽：");
		double width = scanner.nextDouble();
		System.out.println("请输入矩形的长：");
		double length = scanner.nextDouble();
		Rectangle rec = new Rectangle(width, length);
		// 调用方法计算并打印面积
		rec.printArea();
		// 提示输入圆的半径
		System.out.println("请输入圆的半径");
		double r = scanner.nextDouble();
		Circle circle = new Circle(r);
		// 调用方法打印面积
		circle.printArea();

	}

}

