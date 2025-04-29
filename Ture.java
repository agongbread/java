package com.homework;
//创建类
public class Ture {
	// main方法，程序入口
		public static void main(String[] args) {
			// 定义数据变量，需要为long
			long number = 0L;
			long n = 0L;
			long sum = 0L;
			Integer m = new Integer(0);
			// 使得number从0--2147483647
			for (number = 0; number <= 2147483647; number++) {
				// sum初始化0
				sum = 0;
				// 如果number是9的倍数
				if (number % 9 == 0) {
					// 计算各位数之和
					for (n = number; n > 0; n /= 10) {
						sum = sum + n % 10;
					}
					if (sum % 9 != 0) {
						// 如果sum不是9的倍数
						m++;
						System.out.println(number + "： 经验证，不满足该定理");
					}				}			}
			// 如果m=0，说明所有数字都满足定理
			if (m == 0) {
				// 输出
				System.out.println("经验证，定理正确");
			}	}}
