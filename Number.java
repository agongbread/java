package com.homework;
//����һ����
public class Number {
	//����һ��main������Ϊ��ڴ�
		public static void main(String[] args) {
			//����������ֱ�Ϊx��y��z
			Integer x = new Integer(0);
			Integer y = new Integer(0);
			Integer z = new Integer(0);
			System.out.println("xyz+yzz=532�Ľ�Ϊ��");
			//xyz���α���1--9
			for(x=0; x<10; x++) {
				for(y=0; y<10; y++) {		
					for(z=0; z<10; z++) {
						//�ж��Ƿ������ʽ
						if(100*x+10*y+z+100*y+10*z+z==532) {
							//��������������
							System.out.println("x="+x);
							System.out.println("y="+y);
							System.out.println("z="+z);
						}
					}
				}
			}
		}
}
