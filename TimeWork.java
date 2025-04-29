package com.workfourb;

//定义一个接口ICommon
interface ICommon {
	// 构造getTime方法,用于计算时间
	public abstract double getTime(double a, double b, double c);
}

//定义一个Car类
class Car implements ICommon {
	// 构造getTime方法,用于计算时间
	public double getTime(double a, double b, double c) {
		return 1000 / (a * b / c);
	}
}

//定义一个Plane类
class Plane implements ICommon {
	// 构造getTime方法,用于计算时间
	public double getTime(double a, double b, double c) {
		return 1000 / (a + b + c);
	}
}

//定义一个Train类
class AnotherTrafic implements ICommon {
	// 构造getTime这个方法用于计算时间
	public double getTime(double a, double b, double c) {
		return 1000 / (2 * a + b - c);
	}
}

//主方法部分
public class TimeWork {
	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ICommon icommon = (ICommon) Class.forName(args[0]).newInstance();
		// 输出相关信息提示
		System.out.println("交通工具：" + args[0]);
		System.out.println("参数A：" + args[1]);
		System.out.println("参数B：" + args[2]);
		System.out.println("参数C：" + args[3]);
		// 将输入的参数均转化为double类型
		double A = Double.parseDouble(args[1]);
		double B = Double.parseDouble(args[2]);
		double C = Double.parseDouble(args[3]);
		// 调用getTime方法计算时间
		double time = icommon.getTime(A, B, C);
		// 输出
		System.out.println(args[0] + "所需时间:" + String.format("%.3f", time));
	}
}
