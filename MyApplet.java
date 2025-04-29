package bao;
import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet {
	     public void paint(Graphics g) {
			//设置字体颜色为粉色。
			g.setColor(Color.pink);
			//绘制一行文字“这是一个Java Applet程序”。
			g.drawString("这是一个 Java Applet 程序",30,30);
			//字的颜色改为蓝色。
		    g.setColor(Color.blue);
		    //设置字体。
			g.setFont(new Font("宋体",Font.BOLD,20));
			//绘制一行文字“我改变了字体”。
			g.drawString("我改变了字体", 25, 70);
}}