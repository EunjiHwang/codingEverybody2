
public class AccountingApp {
	public static double valueOfSupply = 10000.0; // ���ް�
	public static double vatRate = 0.1; // �ΰ���ġ����
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	public static void main(String[] args) {
		
		// double vat = valueOfSupply*vatRate; // �ΰ��� = ���ް� * �ΰ���ġ��
		// double vat = getVAT();
		// double total = valueOfSupply + vat; // �հ� = ���ް� + �ΰ���
		// double total  = getTotal();
		
		System.out.println("Value of supply : "+ valueOfSupply); // ���ް�
		System.out.println("VAT : "+ getVAT()); // �ΰ���
		System.out.println("Total : "+ getTotal()); // �հ�
	}

}
