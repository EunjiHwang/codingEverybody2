import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8)); // Math 클래스를 직접 사용한 것
		
		// 긴 맥락을 사용하는 클래스는 복제하여 사용한다.
		// 어떤 정보를 파일에 기록할 때 쓰는 클래스 (FileWriter)
		FileWriter f1 = new FileWriter("data.txt"); // new로 클래스의 복제본이 생긴다.
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt"); // f1과는 다른 복제본
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close(); // 파일 작업을 끝냈다 (close)
	}

}
