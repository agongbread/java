//������
package com.homework;
//������
public class Sum {
//��������main���˴���Ϊ��ڵ�ַ
	public static void main(String[] args) {
		//�������i��sum��i��1--200��sumΪ�ۼӺ�
		Integer i = new Integer(0);
		Integer sum = new Integer(0);
		//�����һ��whileѭ����ѭ��������i<200
		while (i < 200) {
			//ִ�����Ϊ��i�Լ��Լ��ڶ���whileѭ��
			i = i+1;
			//�ڶ���whileѭ����ѭ��������i��3�ı���
			while ((i%3) == 0) {
				//ִ����䣺��i�ۼӼ����ܺ�
				sum = sum + i;
				//i���Լ�1
				i++; }	}
		//��ӡ�����Ľ��sum
		System.out.println("1--200֮��3�ı���֮��Ϊ : "+sum ); }}
