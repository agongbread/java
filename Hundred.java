package com.homework;
//������
public class Hundred {
	//����main��������ڵ�ַ
		public static void main(String[] args) {
			//�������������xyz�ֱ�Ϊ���ּ�������
			Integer x = new Integer (0);
			Integer y = new Integer (0);
			Integer z = new Integer (0);
		    Integer i = new Integer (0);
		    //���ѭ����x��1--100
			for(x=0; x<=100; x++) {
				//�ڶ���ѭ����y��0--100
				for(y=0; y<=100; y++) {
					//������ѭ����z��0--100
					for(z=0; z<=100; z++) {
						//�ж��Ƿ�����ټ���Ǯ������������z������3��������
						if((x+y+z==100)&&(5*x+3*y+z/3==100)&&(z%3==0)) {
							//����������������
							i++;
							System.out.println("��"+i+"����: ");
							System.out.println("ĸ������Ϊ��"+x);
							System.out.println("��������Ϊ��"+y);
							System.out.println("С������Ϊ��"+z+"\n");
						}	}	}	}	} 	}
