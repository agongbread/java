package com.homework;
//创造一个类
public class Daffodil {
	//创建一个main方法，此处即为入口地址
	public static void main(String[] args) {
		//定义变量，数字number，各位g...
		Integer number = new Integer (100);
		Integer g = new Integer (0);
		Integer s = new Integer (0);
		Integer b = new Integer (0);
		//m不可以采用new的方式，因为两个new的数字不可能相等
		int m = 0;
		//提示输出
		System.out.println("100--999的水仙花数字有：");
		//for循环遍历100--999
		for(number=100 ; number<=999 ; number++) {
			//分别得到各位数字、十位数字、百位数字
		    g = number%10;
		    s = (number%100)/10;
		    b = number/100;
		    //得到各个位数字的立方和
			m=g*g*g+s*s*s+b*b*b;
			//判断m是否等于原数字
			if(m==number) {
				//如果满足水仙花数的条件，输出该数字
				System.out.print(number+" ");		}}}}
