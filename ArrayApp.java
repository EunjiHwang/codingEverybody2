
public class ArrayApp {
	public static void main(String[] args) {
		// egoing, jinhuck, youbin
//		String users = "egoing, jinhuck, youbin";
		String[] users = new String[3]; // ������ �� ���� �迭�� 1, 2, 3 ...
		users[0] = "egoing"; // �ڸ��� �� ���� �迭�� 0, 1, 2 ... (index)
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		System.out.println(users[1]);
		System.out.println(users.length); // �迭�� ĭ ��
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}

}
