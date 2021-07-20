
public class OutputMethod {
	public static String a() {
		// ...
		return "a";
	}
				// 리턴 값의 데이터 타입
	public static int one() { 
		return 1; // 리턴 뒤에 오는 값이 실행결과가 되고, 리턴은 메소드를 끝낸다.
	}
				// void -> 리턴 값이 없다
	public static void main(String[] args) {
		System.out.println(a());
		System.out.println(one());
	}

}
