package com.workfoura;

public class StringWork {
	
	public static void main(String args[]) {
		//�����ַ���������Ϊָ������
		String str = "Happy new year!";
		//ʵ����һ����StringBuffer�Ķ���s
		StringBuffer s = new StringBuffer(str);
		//������滻���ַ�
		System.out.println("���滻���ַ�Ϊ��"+s.charAt(8));
		//�滻��Ӧλ�õ��ַ�
		s.setCharAt(8,'n');
		//����滻����ַ���
		System.out.println("�滻����ַ���Ϊ��"+s);
		//��������ַ���λ��
		System.out.println("���ַ����е��ַ�"+s.charAt(11)+"���ַ�"+s.charAt(12)+"֮������ַ�");
		//��Ӧλ�ò����ַ�
		s.insert(12, 'L');
		System.out.println("�����ַ�����ַ���Ϊ��"+s);
		//�ַ���ĩ�����ַ�
		s.append("Jiang");
		System.out.println("�ַ���ĩ����ַ���Ϊ��"+s);
	}

}
