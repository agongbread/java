package calculater;

//����awt�࣬�Դ���Ĺ�����ƽ���
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

//�̳�Jframe��
public class Calculaterr extends JFrame {
	private JTextField jNewText;
	private JPanel jNewPanel = new JPanel();
	private JButton[] jButtons;

	// ���췽��
	public Calculaterr() {

		// �������Ĵ������Ŀ
		this.setTitle("������");
		// ���ô�С
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);

		// ����ı������������������ʾ����

		// �����ı��������
		jNewText = new JTextField(25);
		// ��ʼ��ʾ
		jNewText.setText("");
		// ���ò����Ա�����༭
		jNewText.setEditable(false);
		// ���������ַ�������
		jNewText.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		// ���ñ߿򲼾֣����ı��������ڱ���
		this.add(jNewText, BorderLayout.NORTH);

		// �������֣��������ֺ͹��ܰ�����

		// ����һ����壬���水�����񲼾֣�����Ϊ6*5��ÿһ�������ļ������Ϊ2
		jNewPanel.setLayout(new GridLayout(6, 5, 2, 2));

		// ���ð�ť����
		String name[] = { "(", ")", "��", "AC", "DEL", "7", "8", "9", "x^-1", "��x", "4", "5", "6", "x^1/3", "x^2", "1",
				"2", "3", "sin", "x^y", "%", "0", ".", "cos", "tan", "+", "-", "��", "��", "=" };
		// ������Ӧ�����İ�ť
		jButtons = new JButton[name.length];

		// ����ѭ��������ť��������¼�������
		for (int i = 0; i < name.length; i++) {
			// ������ť����
			jButtons[i] = new JButton(name[i]);
			// ����ͳһ�İ�ť�����ʽ
			jButtons[i].setFont(new Font("Times New Roman", Font.BOLD, 20));

			// ����ͳһ�İ�ť������ɫ
			jButtons[i].setBackground(Color.WHITE);
			// ͻ���Ⱥŵ���ɫ�ͱ�����ɫ
			if (name[i].equals("=")) {
				jButtons[i].setBackground(Color.LIGHT_GRAY);
				jButtons[i].setFont(new Font("Times New Roman", Font.BOLD, 30));
				jButtons[i].setForeground(Color.RED);
			}

			// ͻ��DEL�ı�����ɫ
			else if (name[i].equals("DEL"))
				jButtons[i].setBackground(Color.LIGHT_GRAY);
			// ͻ��������ı�����ɫ��������ɫ
			else if (name[i].equals("AC")) {
				jButtons[i].setBackground(Color.LIGHT_GRAY);
				jButtons[i].setForeground(Color.RED);
			}
			// ���ÿһ�����������
			jNewPanel.add(jButtons[i]);
		}

		// ���ı�������

		// ����0����"("���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �����ı������ݣ���"("ת�����ַ�������������������
				jNewText.setText(new StringBuffer(jNewText.getText()).append('(').toString());
			}
		});

		// ����1����")"���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����һ�����飬��")"ת�����ַ�������������������
				jNewText.setText(new StringBuffer(jNewText.getText()).append(')').toString());
			}
		});

		// ����2�����������Ӽ�������дActionListener�ӿ��еķ���
		jButtons[2].addActionListener(new ActionListener() {
			// �����������������
			public void actionPerformed(ActionEvent e) {
				// �����¼�����������ת�����ַ���ӵ��ı������
				jNewText.setText(new StringBuffer(jNewText.getText()).append('��').toString());
			}
		});

		// ����3����AC���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����ı���
				jNewText.setText("");

			}
		});

		// ����4����DEL���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����˸��,��ȡ���ַ��������һλ
				jNewText.setText(jNewText.getText().substring(0, jNewText.getText().length() - 1));
			}
		});
		// ����5����7���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������7ת�����ַ�����ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('7').toString());
			}
		});
		// ����6����8���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������8ת�����ַ�����ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('8').toString());
			}
		});
		// ����7����9���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������9ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('9').toString());
			}
		});
		// ����8����1/X���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��^(-1)ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(-1)").toString());
			}
		});
		// ����9������X���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��^(1/2)ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(1/2)").toString());
			}
		});
		// ����10����4���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������4ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('4').toString());
			}
		});
		// ����11����5���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������5ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('5').toString());
			}
		});
		// ����12����6���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������6ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('6').toString());
			}
		});
		// ����13����3^��X���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��^(1/3)ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(1/3)").toString());
			}
		});
		// ����14����X^2���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��^(2)ת�����ַ����������������飬��ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(2)").toString());
			}
		});
		// ����15����1���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������1ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('1').toString());
			}
		});
		// ����16����2���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������2ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('2').toString());
			}
		});
		// ����17����3���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������3ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('3').toString());
			}
		});
		// ����18����sin���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��sinת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("sin").toString());
			}
		});
		// ����19��^(���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��^(ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("^(").toString());
			}
		});
		// ����20����%���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��%ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('%').toString());
			}
		});
		// ����21����0���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������0ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('0').toString());
			}
		});
		// ����22����.���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��.ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('.').toString());
			}
		});
		// ����23����cos���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��cos(ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("cos").toString());
			}
		});
		// ����24����tan���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��tanת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append("tan").toString());
			}
		});
		// ����25����+���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[25].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��+ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('+').toString());
			}
		});
		// ����26����-���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[26].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��-ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('-').toString());
			}
		});
		// ����27����*���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[27].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��*ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('*').toString());
			}
		});
		// ����28����/���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[28].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��/ת�����ַ��������������������ʾ���
				jNewText.setText(new StringBuffer(jNewText.getText()).append('/').toString());
			}
		});
		// ����29��=���Ӽ�������дActionListener�ӿ��еķ���
		jButtons[29].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�ı��������������
				String input = jNewText.getText();
				// ������ѧ����������
				input = input.replace("sin", "Math.sin");
				input = input.replace("cos", "Math.cos");
				input = input.replace("tan", "Math.tan");
				input = input.replace("��", "Math.PI");
				input = input.replace("%", "/100");
				// ����
				input = pow(input);

				// ����һ��ScriptEngineManager����
				ScriptEngineManager a = new ScriptEngineManager();
				// ͨ��ScriptEngineManager���ScriptEngine����
				ScriptEngine engine = a.getEngineByName("JS");

				// ʹ��JavaScript��eval����������ʽ
				Object eval = null;
				try {
					// ������ʽ
					eval = engine.eval(input);
				} catch (ScriptException scriptinput) {
					scriptinput.printStackTrace();
				}
				double result = Double.parseDouble(eval.toString());

				// ����õ����С��1E-10����ô���Ϊ0
				if (Math.abs(result) < 1E-10)
					result = 0;
				// ��=ת�����ַ�������������������
				jNewText.setText(new StringBuffer(jNewText.getText()).append("=").append(result).toString());
			}

		});
		// �����嵽����
		this.add(jNewPanel);
		// ����ر�ʱ���رմ���
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ���ô���Ϊ�ɼ�
		this.setVisible(true);

	}

	// ����pow����������
	public static String pow(String t) {
		// �õ�^���ֵĵ�һ��λ�ã��洢�ڱ���in��
		int in = t.indexOf('^');
		if (in == -1) {
			return t;
		}
		int start = 0;
		int last = 0;
		// Ѱ���ݺ�����һ������һ�����ֵ�λ���ַ���
		for (int i = in; i >= 0; i--) {
			if (t.charAt(i) == '+' || t.charAt(i) == '-' || t.charAt(i) == '*' || t.charAt(i) == '/') {
				start = i + 1;
				break;
			}
		}
		// �ı���ĵ�һ�������һ�����ֵ�λ���ַ���
		String string1 = t.substring(start, in);
		for (int i = in; i < t.length(); i++) {
			if (t.charAt(i) == ')') {
				last = i;
				break;
			}
		}
		// �ı���ĵڶ������ֵ�λ���ַ���
		String string2 = t.substring(in + 2, last);
		// Ѱ��^���ڵ�λ��
		String string = t.substring(start, last + 1);
		// ��pow���������ݺ���
		t = t.replace(string, "Math.pow(" + string1 + "," + string2 + ")");
		return t;
	}

	// ��main����
	public static void main(String[] args) {
		// ������ʵ�ֹ���
		Calculaterr Calculator = new Calculaterr();

	}

}
