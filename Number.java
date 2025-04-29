package com.homework;
//创建一个类
public class Number {
	//创建一个main方法，为入口处
		public static void main(String[] args) {
			//定义变量，分别为x、y、z
			Integer x = new Integer(0);
			Integer y = new Integer(0);
			Integer z = new Integer(0);
			System.out.println("xyz+yzz=532的解为：");
			//xyz依次遍历1--9
			for(x=0; x<10; x++) {
				for(y=0; y<10; y++) {		
					for(z=0; z<10; z++) {
						//判断是否满足等式
						if(100*x+10*y+z+100*y+10*z+z==532) {
							//满足就输出三个数
							System.out.println("x="+x);
							System.out.println("y="+y);
							System.out.println("z="+z);
						}
					}
				}
			}
		}
}
