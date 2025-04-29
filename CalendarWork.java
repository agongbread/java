package com.workfoura;

import java.io.*;
import java.text.DateFormatSymbols;
import java.util.*;

public class CalendarWork {

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		// 得到今天的年月日
		int year = cal.get(Calendar.YEAR);
		// 月份要注意加一
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 利用string s输出星期几
		String s = "日一二三四五六";
		System.out.println("今天是：" + year + "年 " + month + "月" + date + "日 星期" + s.substring(week - 1, week));
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		// 输出表头
		int wek = 1;
		do {
			System.out.printf("%s\t", weekdayNames[wek]);
			wek++;
		} while (wek <= 7);
		// 换行
		System.out.println();
		// 设置日期为当月的1日
		cal.set(Calendar.DAY_OF_MONTH, 1);
		week = cal.get(Calendar.DAY_OF_WEEK);
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
				System.out.print("  *");
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
				// 如果下一天是一周的第一天而且是下一个月，结束循环
				if (cal.get(Calendar.MONTH) != month-1) {
					flag = false;
				}
			}
		}

	}

}
