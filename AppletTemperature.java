package bao;
//导入Java标准库类
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//定义了一个公共类，它通过extends继承于 Applet类 实现接口ActionListener
public class AppletTemperature extends Applet implements ActionListener {
		private static final long serialVersionUID=1L;
		//定义文本框
		TextField temperature1, temperature2;
		//定义标签
		Label lab1, lab2;
		//定义按钮
		Button button1, button2;
		//设置大小
		Dimension preferredSize;
			//输出标题，位置为（40，110）
	public void paint(Graphics g) {
			g.setColor(Color.blue);
			//绘制一行文字
			g.drawString("摄氏华氏温度转换器",40,110);	}
		public void init() {
			//实例化两个标签，分别赋予内容
			lab1 = new Label("摄氏温度/℃：");
			lab2 = new Label("华氏温度/℉：");
			//实例化文本框
			temperature1 = new TextField(10);
			temperature2 = new TextField(10);
			//添加到面板
			add(lab1);
			add(lab2);
			add(temperature1);
			add(temperature2);
			//设置大小,高度和宽度
			preferredSize = new Dimension(50,20);
			//设置按钮1的样式
			button1 = new Button("确定");
			button1.setBackground(Color.pink);
			button1.setPreferredSize(preferredSize);
			//设置按钮2的样式
			button2 = new Button("重置");
			button2.setBackground(Color.blue);
			button2.setPreferredSize(preferredSize);
			//添加按钮到面板
			add(button1);
			add(button2);
			
			//设置监听部分
			temperature1.addActionListener(this);
			temperature2.addActionListener(this);
			button1.addActionListener(this);
			button2.addActionListener(this);
		}
			//执行温度转化
			public void actionPerformed(ActionEvent evt) {
				
				//判断摄氏度是否为空且按钮有没有按下
				if(temperature1.getText().equals("")&&evt.getSource()==button1) {
					//输入了华氏度且确定按钮按下
					String fah=temperature2.getText();
					//类型转换
					Double fah1=Double.valueOf(fah).doubleValue();
					Double cel2=(fah1-32)/1.8;
					//保留小数点后两位
					float cel3 = (float)(Math.round(cel2*100))/100;
					//输出
					temperature1.setText(cel3+"℃");
				}
				//判断华氏度是否为空且确定按钮是否按下
				else if(temperature2.getText().equals("")&&evt.getSource()==button1) {
					//输入了摄氏度且确定按钮按下
					String cel=temperature1.getText();
					//类型转换
					Double cel1=Double.valueOf(cel).doubleValue();
					Double fah2=cel1*1.8+32;
					//保留小数点后两位
					float fah3 = (float)(Math.round(fah2*100))/100;
					//输出
					temperature2.setText(fah3+"℉");}
				//是否按下重置
				if(evt.getSource()==button2) {
					//按下重置，都无输出
					temperature1.setText("");
					temperature2.setText("");}}}

