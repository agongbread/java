package com.homework;
//����һ����
public class Daffodil {
	//����һ��main�������˴���Ϊ��ڵ�ַ
	public static void main(String[] args) {
		//�������������number����λg...
		Integer number = new Integer (100);
		Integer g = new Integer (0);
		Integer s = new Integer (0);
		Integer b = new Integer (0);
		//m�����Բ���new�ķ�ʽ����Ϊ����new�����ֲ��������
		int m = 0;
		//��ʾ���
		System.out.println("100--999��ˮ�ɻ������У�");
		//forѭ������100--999
		for(number=100 ; number<=999 ; number++) {
			//�ֱ�õ���λ���֡�ʮλ���֡���λ����
		    g = number%10;
		    s = (number%100)/10;
		    b = number/100;
		    //�õ�����λ���ֵ�������
			m=g*g*g+s*s*s+b*b*b;
			//�ж�m�Ƿ����ԭ����
			if(m==number) {
				//�������ˮ�ɻ��������������������
				System.out.print(number+" ");		}}}}
