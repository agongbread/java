package com.homework;
//������
public class Rabbit {
	// һ��rabbit�����������ݹ������������
		public static int rabbit(int m) {
			// ����ǵ�0��1��2�����£�����������1��
			if (m == 0 || m == 1 || m == 2) {
				// ����1
				return 1;
			} else {
			// ���أ��ո��������������������Ӹ�������һ�����ӣ��ټ����ϸ��±������е�����
				return rabbit(m - 2) * 1 + rabbit(m - 1);
			}
		}
		public static void main(String[] args) {
			// ������Ľ��
			System.out.println("2���Ժ����������Ϊ�� " + rabbit(24) + "��");

		}
}
