package com.homework;
//Scanner��λ��java.util.Scanner���У�����Ҫ����˰����������
import java.util.Scanner;

public class YearMonth {
	//����һ��main�������˴���Ϊִ�����
	public static void main(String[] args) {
		/*�����·ݺ���ݣ�ͨ��new Scanner(System.in)����һ��scanner��
		 * ����̨һֱ�ȴ�����ֱ���س��������������ݴ���scanner��Ϊɨ�����
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ����� �� ");
		//�������ݵ����룬��������������
		int year = in.nextInt();
		//��ӡ�����������
		System.out.println(year);
		//��ʾ�����·�
		System.out.println("������Ҫ��ѯ���·� �� ");
		//�������ݵ�����
		int month = in.nextInt();
		//��ӡ��������
		System.out.println(month);
		//���������r�����ж�����
		Integer r = new Integer(0);
		Integer i = new Integer(0);
		//�ж�����ǲ���100��������
		i = year%100;
		//�ж�����Ƿ�Ϊ���꣬r=0��Ϊ����
		switch(i) {
		//i=0����ô���Ϊ100�ı�����r��Ϊ��ݳ���400������
		case 0 :
			r = year%400;
			break;
			//i����0����ݲ�Ϊ100��������r��Ϊ��ݳ���4������
		default :
			r = year%4;
			break;
		}
		//�ж��·ݵ�����
		switch(month) {
		//����·���1��3��5��7��8��10��12������Ϊ31
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"��"+month+"�µ�����Ϊ��31��");
			break;
			//����·���4��6��9��11������Ϊ30��
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"��"+month+"�µ�����Ϊ��30��");
			break;
			//�����2�£������Ƿ�Ϊ�����ж�
		case 2:
			switch(r) {
			//���r=0����Ϊ���꣬��29��
			case 0:
				System.out.println(year+"��"+month+"�µ�����Ϊ��29��");
				break;
				//���������������28��
			default :
					System.out.println(year+"��"+month+"�µ�����Ϊ��28��");
					break;
			}
			break;
		}
	}

}

