package bao;
//����Java��׼����
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//������һ�������࣬��ͨ��extends�̳��� Applet�� ʵ�ֽӿ�ActionListener
public class AppletTemperature extends Applet implements ActionListener {
		private static final long serialVersionUID=1L;
		//�����ı���
		TextField temperature1, temperature2;
		//�����ǩ
		Label lab1, lab2;
		//���尴ť
		Button button1, button2;
		//���ô�С
		Dimension preferredSize;
			//������⣬λ��Ϊ��40��110��
	public void paint(Graphics g) {
			g.setColor(Color.blue);
			//����һ������
			g.drawString("���ϻ����¶�ת����",40,110);	}
		public void init() {
			//ʵ����������ǩ���ֱ�������
			lab1 = new Label("�����¶�/�棺");
			lab2 = new Label("�����¶�/�H��");
			//ʵ�����ı���
			temperature1 = new TextField(10);
			temperature2 = new TextField(10);
			//��ӵ����
			add(lab1);
			add(lab2);
			add(temperature1);
			add(temperature2);
			//���ô�С,�߶ȺͿ��
			preferredSize = new Dimension(50,20);
			//���ð�ť1����ʽ
			button1 = new Button("ȷ��");
			button1.setBackground(Color.pink);
			button1.setPreferredSize(preferredSize);
			//���ð�ť2����ʽ
			button2 = new Button("����");
			button2.setBackground(Color.blue);
			button2.setPreferredSize(preferredSize);
			//��Ӱ�ť�����
			add(button1);
			add(button2);
			
			//���ü�������
			temperature1.addActionListener(this);
			temperature2.addActionListener(this);
			button1.addActionListener(this);
			button2.addActionListener(this);
		}
			//ִ���¶�ת��
			public void actionPerformed(ActionEvent evt) {
				
				//�ж����϶��Ƿ�Ϊ���Ұ�ť��û�а���
				if(temperature1.getText().equals("")&&evt.getSource()==button1) {
					//�����˻��϶���ȷ����ť����
					String fah=temperature2.getText();
					//����ת��
					Double fah1=Double.valueOf(fah).doubleValue();
					Double cel2=(fah1-32)/1.8;
					//����С�������λ
					float cel3 = (float)(Math.round(cel2*100))/100;
					//���
					temperature1.setText(cel3+"��");
				}
				//�жϻ��϶��Ƿ�Ϊ����ȷ����ť�Ƿ���
				else if(temperature2.getText().equals("")&&evt.getSource()==button1) {
					//���������϶���ȷ����ť����
					String cel=temperature1.getText();
					//����ת��
					Double cel1=Double.valueOf(cel).doubleValue();
					Double fah2=cel1*1.8+32;
					//����С�������λ
					float fah3 = (float)(Math.round(fah2*100))/100;
					//���
					temperature2.setText(fah3+"�H");}
				//�Ƿ�������
				if(evt.getSource()==button2) {
					//�������ã��������
					temperature1.setText("");
					temperature2.setText("");}}}

