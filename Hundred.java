package com.homework;
//创建类
public class Hundred {
	//创建main方法，入口地址
		public static void main(String[] args) {
			//定义变量，假设xyz分别为三种鸡的数量
			Integer x = new Integer (0);
			Integer y = new Integer (0);
			Integer z = new Integer (0);
		    Integer i = new Integer (0);
		    //外层循环，x从1--100
			for(x=0; x<=100; x++) {
				//第二层循环，y从0--100
				for(y=0; y<=100; y++) {
					//第三层循环，z从0--100
					for(z=0; z<=100; z++) {
						//判断是否满足百鸡百钱的条件，而且z必须是3的整数倍
						if((x+y+z==100)&&(5*x+3*y+z/3==100)&&(z%3==0)) {
							//满足条件，输出结果
							i++;
							System.out.println("第"+i+"种买法: ");
							System.out.println("母鸡数量为："+x);
							System.out.println("公鸡数量为："+y);
							System.out.println("小鸡数量为："+z+"\n");
						}	}	}	}	} 	}
