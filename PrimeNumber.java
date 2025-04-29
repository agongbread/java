package com.prime.number;
public class PrimeNumber {
		public static void main(String[] args) {
			//定义变量
			Integer i = new Integer(2);
			Integer j = new Integer(2);
			for(i=2; i<=200; i++) {
				//定义变量；
				int m=0;
				//用2至i-1的数依次除i
				for(j=2; j<=i-1; j++) {
					//判断余数结果
					if(i%j==0) {
						//满足条件i%j=0,即余数为0，代表可以整除，那么i不为素数。
						m++;}
				}if(m==0) {
					//如果m=0，说明2到i-1的数除i结果余数均不为0，即i为素数
					System.out.print(i);}}}}


