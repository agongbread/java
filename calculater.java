package calculater;

//引入awt类，以此类的功能设计界面
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

//继承Jframe类
public class Calculaterr extends JFrame {
	private JTextField jNewText;
	private JPanel jNewPanel = new JPanel();
	private JButton[] jButtons;

	// 构造方法
	public Calculaterr() {

		// 设置最大的窗体的题目
		this.setTitle("计算器");
		// 设置大小
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);

		// 设计文本输入区域（最上面的显示区）

		// 设置文本框的列数
		jNewText = new JTextField(25);
		// 初始显示
		jNewText.setText("");
		// 设置不可以被任意编辑
		jNewText.setEditable(false);
		// 设置输入字符的字体
		jNewText.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		// 采用边框布局，将文本框设置在北部
		this.add(jNewText, BorderLayout.NORTH);

		// 按键部分（各个数字和功能按键）

		// 设置一个面板，界面按照网格布局，设置为6*5，每一个按键的间距设置为2
		jNewPanel.setLayout(new GridLayout(6, 5, 2, 2));

		// 设置按钮内容
		String name[] = { "(", ")", "Π", "AC", "DEL", "7", "8", "9", "x^-1", "√x", "4", "5", "6", "x^1/3", "x^2", "1",
				"2", "3", "sin", "x^y", "%", "0", ".", "cos", "tan", "+", "-", "×", "÷", "=" };
		// 设置相应数量的按钮
		jButtons = new JButton[name.length];

		// 利用循环创建按钮对象并添加事件监听器
		for (int i = 0; i < name.length; i++) {
			// 创建按钮对象
			jButtons[i] = new JButton(name[i]);
			// 设置统一的按钮字体格式
			jButtons[i].setFont(new Font("Times New Roman", Font.BOLD, 20));

			// 设置统一的按钮背景颜色
			jButtons[i].setBackground(Color.WHITE);
			// 突出等号的颜色和背景颜色
			if (name[i].equals("=")) {
				jButtons[i].setBackground(Color.LIGHT_GRAY);
				jButtons[i].setFont(new Font("Times New Roman", Font.BOLD, 30));
				jButtons[i].setForeground(Color.RED);
			}

			// 突出DEL的背景颜色
			else if (name[i].equals("DEL"))
				jButtons[i].setBackground(Color.LIGHT_GRAY);
			// 突出清除键的背景颜色和字体颜色
			else if (name[i].equals("AC")) {
				jButtons[i].setBackground(Color.LIGHT_GRAY);
				jButtons[i].setForeground(Color.RED);
			}
			// 添加每一个按键到面板
			jNewPanel.add(jButtons[i]);
		}

		// 在文本框输入

		// 给第0个键"("增加监听，重写ActionListener接口中的方法
		jButtons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 更新文本框内容，将"("转换成字符串，存放在这个数组里
				jNewText.setText(new StringBuffer(jNewText.getText()).append('(').toString());
			}
		});

		// 给第1个键")"增加监听，重写ActionListener接口中的方法
		jButtons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 创建一个数组，将")"转换成字符串，存放在这个数组里
				jNewText.setText(new StringBuffer(jNewText.getText()).append(')').toString());
			}
		});

		// 给第2个按键Π增加监听，重写ActionListener接口中的方法
		jButtons[2].addActionListener(new ActionListener() {
			// 如果发生按键被按到
			public void actionPerformed(ActionEvent e) {
				// 动作事件发生，将Π转换成字符添加到文本框输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('π').toString());
			}
		});

		// 给第3个键AC增加监听，重写ActionListener接口中的方法
		jButtons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 清除文本框
				jNewText.setText("");

			}
		});

		// 给第4个键DEL增加监听，重写ActionListener接口中的方法
		jButtons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 点击退格键,截取掉字符串的最后一位
				jNewText.setText(jNewText.getText().substring(0, jNewText.getText().length() - 1));
			}
		});
		// 给第5个键7增加监听，重写ActionListener接口中的方法
		jButtons[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字7转换成字符串显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('7').toString());
			}
		});
		// 给第6个键8增加监听，重写ActionListener接口中的方法
		jButtons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字8转换成字符串显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('8').toString());
			}
		});
		// 给第7个键9增加监听，重写ActionListener接口中的方法
		jButtons[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字9转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('9').toString());
			}
		});
		// 给第8个键1/X增加监听，重写ActionListener接口中的方法
		jButtons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将^(-1)转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(-1)").toString());
			}
		});
		// 给第9个键√X增加监听，重写ActionListener接口中的方法
		jButtons[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将^(1/2)转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(1/2)").toString());
			}
		});
		// 给第10个键4增加监听，重写ActionListener接口中的方法
		jButtons[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字4转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('4').toString());
			}
		});
		// 给第11个键5增加监听，重写ActionListener接口中的方法
		jButtons[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字5转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('5').toString());
			}
		});
		// 给第12个键6增加监听，重写ActionListener接口中的方法
		jButtons[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字6转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('6').toString());
			}
		});
		// 给第13个键3^√X增加监听，重写ActionListener接口中的方法
		jButtons[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将^(1/3)转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(1/3)").toString());
			}
		});
		// 给第14个键X^2增加监听，重写ActionListener接口中的方法
		jButtons[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将^(2)转换成字符串，存放在这个数组，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(2)").toString());
			}
		});
		// 给第15个键1增加监听，重写ActionListener接口中的方法
		jButtons[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字1转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('1').toString());
			}
		});
		// 给第16个键2增加监听，重写ActionListener接口中的方法
		jButtons[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字2转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('2').toString());
			}
		});
		// 给第17个键3增加监听，重写ActionListener接口中的方法
		jButtons[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字3转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('3').toString());
			}
		});
		// 给第18个键sin增加监听，重写ActionListener接口中的方法
		jButtons[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将sin转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("sin").toString());
			}
		});
		// 给第19键^(增加监听，重写ActionListener接口中的方法
		jButtons[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将^(转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(").toString());
			}
		});
		// 给第20个键%增加监听，重写ActionListener接口中的方法
		jButtons[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将%转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('%').toString());
			}
		});
		// 给第21个键0增加监听，重写ActionListener接口中的方法
		jButtons[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将数字0转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('0').toString());
			}
		});
		// 给第22个键.增加监听，重写ActionListener接口中的方法
		jButtons[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将.转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('.').toString());
			}
		});
		// 给第23个键cos增加监听，重写ActionListener接口中的方法
		jButtons[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将cos(转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("cos").toString());
			}
		});
		// 给第24个键tan增加监听，重写ActionListener接口中的方法
		jButtons[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将tan转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append("tan").toString());
			}
		});
		// 给第25个键+增加监听，重写ActionListener接口中的方法
		jButtons[25].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将+转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('+').toString());
			}
		});
		// 给第26个键-增加监听，重写ActionListener接口中的方法
		jButtons[26].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将-转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('-').toString());
			}
		});
		// 给第27个键*增加监听，重写ActionListener接口中的方法
		jButtons[27].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将*转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('*').toString());
			}
		});
		// 给第28个键/增加监听，重写ActionListener接口中的方法
		jButtons[28].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 将/转换成字符串，存放在这个数组里，显示输出
				jNewText.setText(new StringBuffer(jNewText.getText()).append('/').toString());
			}
		});
		// 给第29键=增加监听，重写ActionListener接口中的方法
		jButtons[29].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 获取文本框中输入的内容
				String input = jNewText.getText();
				// 调用数学方法来计算
				input = input.replace("sin", "Math.sin");
				input = input.replace("cos", "Math.cos");
				input = input.replace("tan", "Math.tan");
				input = input.replace("π", "Math.PI");
				input = input.replace("%", "/100");
				// 计算
				input = pow(input);

				// 创建一个ScriptEngineManager对象
				ScriptEngineManager a = new ScriptEngineManager();
				// 通过ScriptEngineManager获得ScriptEngine对象
				ScriptEngine engine = a.getEngineByName("JS");

				// 使用JavaScript的eval函数计算表达式
				Object eval = null;
				try {
					// 计算表达式
					eval = engine.eval(input);
				} catch (ScriptException scriptinput) {
					scriptinput.printStackTrace();
				}
				double result = Double.parseDouble(eval.toString());

				// 如果得到结果小于1E-10，那么结果为0
				if (Math.abs(result) < 1E-10)
					result = 0;
				// 将=转换成字符串，存放在这个数组里
				jNewText.setText(new StringBuffer(jNewText.getText()).append("=").append(result).toString());
			}

		});
		// 添加面板到窗体
		this.add(jNewPanel);
		// 点击关闭时，关闭窗口
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 设置窗口为可见
		this.setVisible(true);

	}

	// 定义pow方法来计算
	public static String pow(String t) {
		// 得到^出现的第一个位置，存储在变量in中
		int in = t.indexOf('^');
		if (in == -1) {
			return t;
		}
		int start = 0;
		int last = 0;
		// 寻找幂函数第一个数第一个数字的位置字符串
		for (int i = in; i >= 0; i--) {
			if (t.charAt(i) == '+' || t.charAt(i) == '-' || t.charAt(i) == '*' || t.charAt(i) == '/') {
				start = i + 1;
				break;
			}
		}
		// 文本框的第一个数最后一个数字的位置字符串
		String string1 = t.substring(start, in);
		for (int i = in; i < t.length(); i++) {
			if (t.charAt(i) == ')') {
				last = i;
				break;
			}
		}
		// 文本框的第二个数字的位置字符串
		String string2 = t.substring(in + 2, last);
		// 寻找^所在的位置
		String string = t.substring(start, last + 1);
		// 用pow方法计算幂函数
		t = t.replace(string, "Math.pow(" + string1 + "," + string2 + ")");
		return t;
	}

	// 主main方法
	public static void main(String[] args) {
		// 计算器实现功能
		Calculaterr Calculator = new Calculaterr();

	}

}
