package com.prime.number;
public class PrimeNumber {
		public static void main(String[] args) {
			//�������
			Integer i = new Integer(2);
			Integer j = new Integer(2);
			for(i=2; i<=200; i++) {
				//���������
				int m=0;
				//��2��i-1�������γ�i
				for(j=2; j<=i-1; j++) {
					//�ж��������
					if(i%j==0) {
						//��������i%j=0,������Ϊ0�����������������ôi��Ϊ������
						m++;}
				}if(m==0) {
					//���m=0��˵��2��i-1������i�����������Ϊ0����iΪ����
					System.out.print(i);}}}}


