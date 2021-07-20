class Print {
	public String delimiter;
	// 메소드가 인스턴스에 소속할 때는 static을 빼야 한다.
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class staticMethod {
	// static - class method, no static - instance method
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		Print t1 = new Print(); // instance => t1
		t1.delimiter = "-";
		t1.a(); // 인스턴스에 소속
		t1.b();
//		Print.b();		static이 없으면 클래스에 소속하지 않기 때문에 오류가 난다.
		Print.c("$");  // static이 있으므로 클래스에 소속하기 때문에 호출이 가능하다.
		
//		Print.a("*");
//		Print.b("*");
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}

	

}
