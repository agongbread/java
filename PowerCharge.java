package bao;
	//����javax.swing.JOptionPane;
	import javax.swing.JOptionPane;
	//����һ��������
	public class PowerCharge {
		//main()�������
		public static void main(String[] arrgs) {
			//����������ַ�
			String power;
			double sum = 0;
			//����JOptionPane�����ʴ�򣬻��������ַ�
			power=JOptionPane.showInputDialog(null, "�����������õ���/�ȣ�\n", "�Զ���Ѳ�ѯ", JOptionPane.QUESTION_MESSAGE);
			//ǿ������ת��
			int p = Integer.parseInt(power);
			//����if��������
			if(p<=240) {
				sum=0.55*p;
			}else if(p<=540) {
				sum=0.55*240+0.7*(p-240);
			}else {
				sum=0.55*240+0.7*(540-240)+0.95*(p-540);			}
			//����JOptionPane.showMessageDialog��ʾ��ѵ����
			JOptionPane.showMessageDialog(null, "���ĵ��Ϊ��"+sum+"Ԫ�����", "��Ѳ�ѯ���", JOptionPane.PLAIN_MESSAGE);}	}

