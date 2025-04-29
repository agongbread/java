package com.workfoura;
//����һ����
public class Arrary {
	//����һ�����������������������
	public static int[] randomArray(int length, int maxnum) {
		//����һ����Ϊlength��һά����
		int[] array = new int[length];
		//����ÿһ��Ԫ��
		for (int i = 0; i < length; i++) {
			//ÿһ��Ԫ������random()����һ����������������ֵ�õ���
			array[i] = (int) (maxnum * Math.random());
		}
		//�������ɵ��������
		return array;
	}
	//����main
	public static void main(String[] args) {
		//���÷���������10λ���ֵΪ200������
		int[] array = randomArray(10, 200);
		// ���������ɵ�ʮ������
		System.out.println("���ɵ��������");
		for (int i = 0; i < array.length; i++) {
			//�������ÿ����
			System.out.print(array[i] + " ");
		}
		//�������
		int sum = 0;
		int maxnum = array[0];
		int minnum = array[0];
		int maxpos = 0;
		int minpos = 0;
		// ���
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		//�õ������Сֵ����λ��
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxnum) {
				maxnum = array[i];
				maxpos = i;
			}
			if (array[i] < minnum) {
				minnum = array[i];
				minpos = i;
			}
		}
		//��С���� ����
		for (int i = 0; i < array.length; i++) {
			int m = i;
			//��i��Ԫ�غ͵�i+1��Ԫ�ؼ���֮���Ԫ�رȽϴ�С
			for (int j = i + 1; j < array.length; j++) {
				//�����j��Ԫ���ǽ�Сֵ����m=j
				if (array[m] > array[j]) {
					m = j;
				}
			}
			//forѭ���������õ��˱Ƚϵ���ֵ������Сֵ��λ��,����Сֵ���i��Ԫ�ؽ���
			int temp = array[i];
			array[i] = array[m];
			array[m] = temp;
		}
		// �������ֵ
		System.out.println("");
		System.out.println("����������ֵ��" + maxnum + " ; ���ֵλ��Ϊ��0-9����" + maxpos);
		System.out.println("���������Сֵ��" + minnum + "  ;��Сֵλ��Ϊ��0-9����" + minpos);
		System.out.println("�����֮�ͣ�" + sum);
		System.out.println("��С������������������");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
