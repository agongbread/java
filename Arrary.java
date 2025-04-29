package com.workfoura;
//创建一个类
public class Arrary {
	//创建一个方法用来生成随机的数组
	public static int[] randomArray(int length, int maxnum) {
		//定义一个长为length的一维数组
		int[] array = new int[length];
		//遍历每一个元素
		for (int i = 0; i < length; i++) {
			//每一个元素利用random()生成一个随机数，乘以最大值得到。
			array[i] = (int) (maxnum * Math.random());
		}
		//返回生成的随机数组
		return array;
	}
	//定义main
	public static void main(String[] args) {
		//调用方法，生成10位最大值为200的数组
		int[] array = randomArray(10, 200);
		// 输出随机生成的十个数字
		System.out.println("生成的随机数：");
		for (int i = 0; i < array.length; i++) {
			//依次输出每个数
			System.out.print(array[i] + " ");
		}
		//定义变量
		int sum = 0;
		int maxnum = array[0];
		int minnum = array[0];
		int maxpos = 0;
		int minpos = 0;
		// 求和
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		//得到最大最小值及其位置
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxnum) {
				maxnum = array[i];
				maxpos = i;
			}
			if (array[i] < minnum) {
				minnum = array[i];
				minpos = i;
			}
		}
		//从小到大 排序
		for (int i = 0; i < array.length; i++) {
			int m = i;
			//第i个元素和第i+1个元素及其之后的元素比较大小
			for (int j = i + 1; j < array.length; j++) {
				//如果第j个元素是较小值，令m=j
				if (array[m] > array[j]) {
					m = j;
				}
			}
			//for循环结束，得到了比较的数值当中最小值的位置,将最小值与第i个元素交换
			int temp = array[i];
			array[i] = array[m];
			array[m] = temp;
		}
		// 输出所求值
		System.out.println("");
		System.out.println("随机数中最大值：" + maxnum + " ; 最大值位置为（0-9）：" + maxpos);
		System.out.println("随机数中最小值：" + minnum + "  ;最小值位置为（0-9）：" + minpos);
		System.out.println("随机数之和：" + sum);
		System.out.println("从小到大依次输出随机数：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
