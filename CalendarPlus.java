package com.workfoura;

import java.io.*;
import java.text.DateFormatSymbols;
import java.util.*;

public class CalendarPlus {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		System.out.println("\t\t\t\t\t\t\t������\n");
		// ��ʾ������ݡ��·ݡ�����
		System.out.println("��������ݣ�");
		int year = s.nextInt();
		System.out.println("�������·ݣ�");
		int month = s.nextInt();
		System.out.println("���������ڣ�");
		int date = s.nextInt();
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		// �����ͷ
		System.out.println();
		int wek = 1;
		do {
			System.out.printf("%s\t", weekdayNames[wek]);
			wek++;
		} while (wek <= 7);
		// ����
		System.out.println();
		// ��������·�Ϊ����ֵ
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, (month - 1));
		// ��������Ϊ1��
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// ���µ�һ���ڱ����ǵڼ���
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// num��������¼�ڱ��µ�ǰһ�����м�����Ҫд��������
		int num = 0;
		while (week != 1) {
			num++;
			cal.add(Calendar.DAY_OF_MONTH, -1);
			week = cal.get(Calendar.DAY_OF_WEEK);
		}
		// ����ϸ��µĲ�������
		for (int i = 0; i < num; i++) {
			int day = cal.get(Calendar.DAY_OF_MONTH);
			System.out.printf("  %d\t\t ", day);
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		// ������µ�����
		// ����flag������Ƿ���Ҫ����ѭ��
		boolean flag = true;
		while (flag) {
			int dat = cal.get(Calendar.DAY_OF_MONTH);
			// ����ǵ���������ע
			if (dat == date) {
				System.out.print(" *");
			} else {
				System.out.print("  ");
			}
			System.out.printf("%d\t\t ", dat);
			// ��һ��
			cal.add(Calendar.DAY_OF_MONTH, 1);
			week = cal.get(Calendar.DAY_OF_WEEK);
			// �����һ����һ�ܵĵ�һ�죬����
			if (week == 1) {
				System.out.println();
				// �����һ����һ�ܵĵ�һ����Ҳ��Ǳ��£�����ѭ��
				if (cal.get(Calendar.MONTH) != (month - 1)) {
					flag = false;
				}
			}
		}
	}
}