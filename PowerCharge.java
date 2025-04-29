package bao;
	//引入javax.swing.JOptionPane;
	import javax.swing.JOptionPane;
	//建立一个公共类
	public class PowerCharge {
		//main()程序入口
		public static void main(String[] arrgs) {
			//定义输入的字符
			String power;
			double sum = 0;
			//调用JOptionPane开启问答框，获得输入的字符
			power=JOptionPane.showInputDialog(null, "请输入您的用电量/度：\n", "自动电费查询", JOptionPane.QUESTION_MESSAGE);
			//强制类型转换
			int p = Integer.parseInt(power);
			//采用if语句计算电费
			if(p<=240) {
				sum=0.55*p;
			}else if(p<=540) {
				sum=0.55*240+0.7*(p-240);
			}else {
				sum=0.55*240+0.7*(540-240)+0.95*(p-540);			}
			//调用JOptionPane.showMessageDialog显示电费的输出
			JOptionPane.showMessageDialog(null, "您的电费为："+sum+"元人民币", "电费查询结果", JOptionPane.PLAIN_MESSAGE);}	}

