package wrap;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		System.out.println("one==two的结果：" + (one==two));//1
		
		Integer three = 100;//自动装箱操作
		//Integer three = Integer.vauleOf(100);
		System.out.println("three==100的结果：" + (three == 100));//2 自动拆箱
		
		//Integer four = 100;
		Integer four = Integer.valueOf(100);
		System.out.println("four==three的结果：" + (four==three));//=128<参数<127
		
		Integer five = 200;
		System.out.println("five==200的结果：" + (five==200));
		
		Integer six = 200;
		System.out.println("five==six的结果：" + (five==six));
		
		Double d1 = Double.valueOf(100);
		System.out.println("d1==100的结果：" + (d1==100));
		
		Double d2 = Double.valueOf(100);
		System.out.println("d1==d2的结果：" + (d1==d2));//在基本数据类型中double和float是没有常量池的
		
		 //定义float类型变量，赋值为88.99
		float f1 = 88.99f;
		//将基本类型转换为字符串
		String s1 = String.valueOf(f1);                         
		//打印输出
		System.out.println("f1转型为String型后与整数20的求和结果为：" + (s1 +20));
		//定义String类型变量，赋值为"188.55"
		String str = "188.55";
	    // 将字符串转换为基本类型double
		Double d3 = Double.valueOf(str);
		//打印输出
		System.out.println("str转换为double型后与整数20的求和结果为：" + (d3 +20));
	}

}
