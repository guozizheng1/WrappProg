package wrap;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		System.out.println("one==two�Ľ����" + (one==two));//1
		
		Integer three = 100;//�Զ�װ�����
		//Integer three = Integer.vauleOf(100);
		System.out.println("three==100�Ľ����" + (three == 100));//2 �Զ�����
		
		//Integer four = 100;
		Integer four = Integer.valueOf(100);
		System.out.println("four==three�Ľ����" + (four==three));//=128<����<127
		
		Integer five = 200;
		System.out.println("five==200�Ľ����" + (five==200));
		
		Integer six = 200;
		System.out.println("five==six�Ľ����" + (five==six));
		
		Double d1 = Double.valueOf(100);
		System.out.println("d1==100�Ľ����" + (d1==100));
		
		Double d2 = Double.valueOf(100);
		System.out.println("d1==d2�Ľ����" + (d1==d2));//�ڻ�������������double��float��û�г����ص�
		
		 //����float���ͱ�������ֵΪ88.99
		float f1 = 88.99f;
		//����������ת��Ϊ�ַ���
		String s1 = String.valueOf(f1);                         
		//��ӡ���
		System.out.println("f1ת��ΪString�ͺ�������20����ͽ��Ϊ��" + (s1 +20));
		//����String���ͱ�������ֵΪ"188.55"
		String str = "188.55";
	    // ���ַ���ת��Ϊ��������double
		Double d3 = Double.valueOf(str);
		//��ӡ���
		System.out.println("strת��Ϊdouble�ͺ�������20����ͽ��Ϊ��" + (d3 +20));
	}

}
