class Print {
	public String delimiter;
	// �޼ҵ尡 �ν��Ͻ��� �Ҽ��� ���� static�� ���� �Ѵ�.
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
		t1.a(); // �ν��Ͻ��� �Ҽ�
		t1.b();
//		Print.b();		static�� ������ Ŭ������ �Ҽ����� �ʱ� ������ ������ ����.
		Print.c("$");  // static�� �����Ƿ� Ŭ������ �Ҽ��ϱ� ������ ȣ���� �����ϴ�.
		
//		Print.a("*");
//		Print.b("*");
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}

	

}
