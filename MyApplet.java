package bao;
import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet {
	     public void paint(Graphics g) {
			//����������ɫΪ��ɫ��
			g.setColor(Color.pink);
			//����һ�����֡�����һ��Java Applet���򡱡�
			g.drawString("����һ�� Java Applet ����",30,30);
			//�ֵ���ɫ��Ϊ��ɫ��
		    g.setColor(Color.blue);
		    //�������塣
			g.setFont(new Font("����",Font.BOLD,20));
			//����һ�����֡��Ҹı������塱��
			g.drawString("�Ҹı�������", 25, 70);
}}