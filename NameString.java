package com.workfoura;
//新建一个类
public class NameString {
	//main方法
	public static void main(String args[]) {
		//定义一个字符串
		String name = "My name is NetworkCrazy";
		//输出字符串
		System.out.println("name字符串为："+name);
		//L为字符串长度
		int L = name.length();
		//输出字符串长度
		System.out.println("name字符串长度为："+L);
		//输出第一个和最后一个字符
		System.out.println("name字符串第一个字符为："+name.charAt(0));
		System.out.println("name字符串最后一个字符为："+name.charAt(L-1));
		int i = name.indexOf("Net");
		System.out.println("利用substring()方法提取字符串："+name.substring(i, L));
		System.out.println("最后一个e出现的位置："+name.lastIndexOf("e"));
	}

}
