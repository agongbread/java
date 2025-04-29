package com.workfoura;

import java.io.*;
import java.text.DateFormatSymbols;
import java.util.*;

public class CalendarWork {

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		// �õ������������
		int year = cal.get(Calendar.YEAR);
		// �·�Ҫע���һ
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// ����string s������ڼ�
		String s = "��һ����������";
		System.out.println("�����ǣ�" + year + "�� " + month + "��" + date + "�� ����" + s.substring(week - 1, week));
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		// �����ͷ
		int wek = 1;
		do {
			System.out.printf("%s\t", weekdayNames[wek]);
			wek++;
		} while (wek <= 7);
		// ����
		System.out.println();
		// ��������Ϊ���µ�1��
		cal.set(Calendar.DAY_OF_MONTH, 1);
		week = cal.get(Calendar.DAY_OF_WEEK);
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
				System.out.print("  *");
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
				// �����һ����һ�ܵĵ�һ���������һ���£�����ѭ��
				if (cal.get(Calendar.MONTH) != month-1) {
					flag = false;
				}
			}
		}

	}

}
