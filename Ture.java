package com.homework;
//������
public class Ture {
	// main�������������
		public static void main(String[] args) {
			// �������ݱ�������ҪΪlong
			long number = 0L;
			long n = 0L;
			long sum = 0L;
			Integer m = new Integer(0);
			// ʹ��number��0--2147483647
			for (number = 0; number <= 2147483647; number++) {
				// sum��ʼ��0
				sum = 0;
				// ���number��9�ı���
				if (number % 9 == 0) {
					// �����λ��֮��
					for (n = number; n > 0; n /= 10) {
						sum = sum + n % 10;
					}
					if (sum % 9 != 0) {
						// ���sum����9�ı���
						m++;
						System.out.println(number + "�� ����֤��������ö���");
					}				}			}
			// ���m=0��˵���������ֶ����㶨��
			if (m == 0) {
				// ���
				System.out.println("����֤��������ȷ");
			}	}}
