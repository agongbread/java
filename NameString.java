package com.workfoura;
//�½�һ����
public class NameString {
	//main����
	public static void main(String args[]) {
		//����һ���ַ���
		String name = "My name is NetworkCrazy";
		//����ַ���
		System.out.println("name�ַ���Ϊ��"+name);
		//LΪ�ַ�������
		int L = name.length();
		//����ַ�������
		System.out.println("name�ַ�������Ϊ��"+L);
		//�����һ�������һ���ַ�
		System.out.println("name�ַ�����һ���ַ�Ϊ��"+name.charAt(0));
		System.out.println("name�ַ������һ���ַ�Ϊ��"+name.charAt(L-1));
		int i = name.indexOf("Net");
		System.out.println("����substring()������ȡ�ַ�����"+name.substring(i, L));
		System.out.println("���һ��e���ֵ�λ�ã�"+name.lastIndexOf("e"));
	}

}
