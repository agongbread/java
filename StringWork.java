package com.workfoura;

public class StringWork {
	
	public static void main(String args[]) {
		//定义字符串，内容为指定内容
		String str = "Happy new year!";
		//实例化一个类StringBuffer的对象s
		StringBuffer s = new StringBuffer(str);
		//输出被替换的字符
		System.out.println("被替换的字符为："+s.charAt(8));
		//替换对应位置的字符
		s.setCharAt(8,'n');
		//输出替换后的字符串
		System.out.println("替换后的字符串为："+s);
		//输出插入字符的位置
		System.out.println("在字符串中的字符"+s.charAt(11)+"和字符"+s.charAt(12)+"之间插入字符");
		//对应位置插入字符
		s.insert(12, 'L');
		System.out.println("插入字符后的字符串为："+s);
		//字符串末插入字符
		s.append("Jiang");
		System.out.println("字符串末添加字符后为："+s);
	}

}
