package com.workfoura;

import java.io.*;
import java.text.DateFormatSymbols;
import java.util.*;

public class CalendarPlus {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		System.out.println("\t\t\t\t\t\t\t万年历\n");
		// 提示输入年份、月份、日期
		System.out.println("请输入年份：");
		int year = s.nextInt();
		System.out.println("请输入月份：");
		int month = s.nextInt();
		System.out.println("请输入日期：");
		int date = s.nextInt();
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		// 输出表头
		System.out.println();
		int wek = 1;
		do {
			System.out.printf("%s\t", weekdayNames[wek]);
			wek++;
		} while (wek <= 7);
		// 换行
		System.out.println();
		// 设置年份月份为输入值
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, (month - 1));
		// 设置日期为1号
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// 本月第一天在本周是第几天
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// num计数，记录在本月的前一个月有几天需要写在日历中
		int num = 0;
		while (week != 1) {
			num++;
			cal.add(Calendar.DAY_OF_MONTH, -1);
			week = cal.get(Calendar.DAY_OF_WEEK);
		}
		// 输出上个月的部分日期
		for (int i = 0; i < num; i++) {
			int day = cal.get(Calendar.DAY_OF_MONTH);
			System.out.printf("  %d\t\t ", day);
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		// 输出本月的日期
		// 利用flag来标记是否需要跳出循环
		boolean flag = true;
		while (flag) {
			int dat = cal.get(Calendar.DAY_OF_MONTH);
			// 如果是当天则做标注
			if (dat == date) {
				System.out.print(" *");
			} else {
				System.out.print("  ");
			}
			System.out.printf("%d\t\t ", dat);
			// 下一天
			cal.add(Calendar.DAY_OF_MONTH, 1);
			week = cal.get(Calendar.DAY_OF_WEEK);
			// 如果下一天是一周的第一天，换行
			if (week == 1) {
				System.out.println();
				// 如果下一天是一周的第一天而且不是本月，结束循环
				if (cal.get(Calendar.MONTH) != (month - 1)) {
					flag = false;
				}
			}
		}
	}
}