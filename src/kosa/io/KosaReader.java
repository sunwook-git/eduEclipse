package kosa.io;

import java.io.FileReader;

public class KosaReader {

	public static void main(String[] args) {
		//poem.txt 에서 문자열 데이터 읽어오기
		FileReader reader = null;
		char arr[] = new char[256];
		
		try {
			//File Reader 객체 생성
			reader = new FileReader("poem.txt");
			
			while(true) {
				int data = reader.read(arr);
				if (data == -1 ) break;
				System.out.print(arr);
			}
			
//			while(true) {
//				int data = reader.read();	//아스키코드 값 or -1
//				if(data == -1) break;
//				System.out.println((char)data);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();		//파일을 열었기 때문에 닫아주는 작업해야 됨
			} catch (Exception e2) {				
			}
		}
	}
}
