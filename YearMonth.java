package com.homework;
//Scanner类位于java.util.Scanner包中，所以要引入此包，完成输入
import java.util.Scanner;

public class YearMonth {
	//构建一个main方法，此处即为执行入口
	public static void main(String[] args) {
		/*输入月份和年份：通过new Scanner(System.in)创建一个scanner，
		 * 控制台一直等待输入直到回车键，把输入内容传给scanner作为扫描对象
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要查询的年份 ： ");
		//整型数据的输入，获得输入内容年份
		int year = in.nextInt();
		//打印出输入的内容
		System.out.println(year);
		//提示输入月份
		System.out.println("请输入要查询的月份 ： ");
		//整型数据的输入
		int month = in.nextInt();
		//打印输入内容
		System.out.println(month);
		//定义变量，r用来判断闰年
		Integer r = new Integer(0);
		Integer i = new Integer(0);
		//判断年份是不是100的整数倍
		i = year%100;
		//判断年份是否为闰年，r=0即为闰年
		switch(i) {
		//i=0，那么年份为100的倍数，r即为年份除以400的余数
		case 0 :
			r = year%400;
			break;
			//i不是0，年份不为100整数倍，r即为年份除以4的余数
		default :
			r = year%4;
			break;
		}
		//判断月份的天数
		switch(month) {
		//如果月份是1、3、5、7、8、10、12，天数为31
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"年"+month+"月的天数为：31天");
			break;
			//如果月份是4、6、9、11，天数为30天
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"年"+month+"月的天数为：30天");
			break;
			//如果是2月，根据是否为闰年判断
		case 2:
			switch(r) {
			//如果r=0，即为闰年，有29天
			case 0:
				System.out.println(year+"年"+month+"月的天数为：29天");
				break;
				//如果不是闰年则有28天
			default :
					System.out.println(year+"年"+month+"月的天数为：28天");
					break;
			}
			break;
		}
	}

}

