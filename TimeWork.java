package com.workfourb;

//����һ���ӿ�ICommon
interface ICommon {
	// ����getTime����,���ڼ���ʱ��
	public abstract double getTime(double a, double b, double c);
}

//����һ��Car��
class Car implements ICommon {
	// ����getTime����,���ڼ���ʱ��
	public double getTime(double a, double b, double c) {
		return 1000 / (a * b / c);
	}
}

//����һ��Plane��
class Plane implements ICommon {
	// ����getTime����,���ڼ���ʱ��
	public double getTime(double a, double b, double c) {
		return 1000 / (a + b + c);
	}
}

//����һ��Train��
class AnotherTrafic implements ICommon {
	// ����getTime����������ڼ���ʱ��
	public double getTime(double a, double b, double c) {
		return 1000 / (2 * a + b - c);
	}
}

//����������
public class TimeWork {
	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ICommon icommon = (ICommon) Class.forName(args[0]).newInstance();
		// ��������Ϣ��ʾ
		System.out.println("��ͨ���ߣ�" + args[0]);
		System.out.println("����A��" + args[1]);
		System.out.println("����B��" + args[2]);
		System.out.println("����C��" + args[3]);
		// ������Ĳ�����ת��Ϊdouble����
		double A = Double.parseDouble(args[1]);
		double B = Double.parseDouble(args[2]);
		double C = Double.parseDouble(args[3]);
		// ����getTime��������ʱ��
		double time = icommon.getTime(A, B, C);
		// ���
		System.out.println(args[0] + "����ʱ��:" + String.format("%.3f", time));
	}
}
