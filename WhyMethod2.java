
public class WhyMethod2 {
	public static void main(String[] args) {
		
		// �Ȱ��� �ڵ尡 100000000���� �� �ִٰ� ���� ...
					// ����, argument
		printTwoTimes("a", "-");
		// 100000000
		printTwoTimes("a", "*");
		// 100000000
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
	}
									 // �Ű�����, parameter
	public static void printTwoTimes(String text, String delimiter) { 
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
}