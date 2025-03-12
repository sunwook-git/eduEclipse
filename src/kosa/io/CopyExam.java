package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExam {

	public static void main(String[] args) {
		// poem2.txt => poem3.txt  복사를 구현해보자 
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[32];
		
		try {
			reader = new FileReader("poem2.txt");
			while(true) {
				int data = reader.read(arr);
				if (data == -1 ) break;
			}
			 writer = new FileWriter("poem3.txt");
			 String str = String.copyValueOf(arr);
			 writer.write(str);
			
			System.out.print(str);
			
		} catch (Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

}
