package com.multiply;
public class MultipltySum {
		//main¿ªÊ¼£»
			public static void main(String[] args) {
				System.out.println("1!+2!+...+9!=");
				Integer i=new Integer(1);	
				Integer sum=new Integer(0);
				for(i=1 ;i<=9; i++) {					
					int mul=1;
					int j=1;
					while(j<=i) {						
						mul=mul*j;
						j++;
					}
					sum=sum+mul;				}				
				System.out.println(sum);
			}	}

