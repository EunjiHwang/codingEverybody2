class Greeting {
	// public(사용자가 사용 가능), protected, default(생략), private(같은 클래스 안에서만 사용 가능)
	public static void hi() {
		System.out.println("Hi");
	}
}

public class AccessLevelModifiersMethod {
	public static void main(String[] args) {
		Greeting.hi();
	}

}
