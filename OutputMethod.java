
public class OutputMethod {
	public static String a() {
		// ...
		return "a";
	}
				// ���� ���� ������ Ÿ��
	public static int one() { 
		return 1; // ���� �ڿ� ���� ���� �������� �ǰ�, ������ �޼ҵ带 ������.
	}
				// void -> ���� ���� ����
	public static void main(String[] args) {
		System.out.println(a());
		System.out.println(one());
	}

}
