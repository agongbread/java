package com.homework;
//创建类
public class Rabbit {
	// 一个rabbit方法，用来递归计算兔子数量
		public static int rabbit(int m) {
			// 如果是第0、1、2三个月，兔子数量是1对
			if (m == 0 || m == 1 || m == 2) {
				// 返回1
				return 1;
			} else {
			// 返回：刚刚能满足生育条件的兔子各自生了一对兔子，再加上上个月本来就有的兔子
				return rabbit(m - 2) * 1 + rabbit(m - 1);
			}
		}
		public static void main(String[] args) {
			// 输出最后的结果
			System.out.println("2年以后的兔子数量为： " + rabbit(24) + "对");

		}
}
