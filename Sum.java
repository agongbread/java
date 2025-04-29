//创建包
package com.homework;
//创建类
public class Sum {
//构建方法main，此处即为入口地址
	public static void main(String[] args) {
		//定义变量i和sum；i从1--200；sum为累加和
		Integer i = new Integer(0);
		Integer sum = new Integer(0);
		//进入第一层while循环，循环条件是i<200
		while (i < 200) {
			//执行语句为，i自加以及第二层while循环
			i = i+1;
			//第二层while循环的循环条件：i是3的倍数
			while ((i%3) == 0) {
				//执行语句：将i累加计入总和
				sum = sum + i;
				//i的自加1
				i++; }	}
		//打印出最后的结果sum
		System.out.println("1--200之间3的倍数之和为 : "+sum ); }}
