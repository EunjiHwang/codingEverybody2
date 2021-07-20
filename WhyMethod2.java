
public class WhyMethod2 {
	public static void main(String[] args) {
		
		// 똑같은 코드가 100000000줄이 더 있다고 가정 ...
					// 인자, argument
		printTwoTimes("a", "-");
		// 100000000
		printTwoTimes("a", "*");
		// 100000000
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
	}
									 // 매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) { 
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
}
