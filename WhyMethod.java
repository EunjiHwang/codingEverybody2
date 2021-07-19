
public class WhyMethod {
	public static void printTwoTimesA() { // 메소드를 사용하는 것이 수정하기에도 훨씬 편리
		System.out.println("-");
		System.out.println("a");
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		
		// 똑같은 코드가 100000000줄이 더 있다고 가정 ...
//		System.out.println("-");
//		System.out.println("a");
//		System.out.println("a");
		printTwoTimesA();
		// 100000000
//		System.out.println("-");
//		System.out.println("a");
//		System.out.println("a");
		printTwoTimesA();
		// 100000000
//		System.out.println("-");
//		System.out.println("a");
//		System.out.println("a");
		printTwoTimesA();
		
	}

}
