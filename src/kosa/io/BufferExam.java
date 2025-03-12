package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner => 키보드로부터 데이터 입력
		// System.in => InputStream => InputStreamReader(바이트 스트림이 문자 스트림으로)
		// 한줄씩 읽으려면 BufferedReader 사용
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {	//예외가 발생할 수 있는 코드를 감싸서 실행
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));

			System.out.print("입력: ");
			String str = "";
			while ((str = br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
			System.out.println("쓰기완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {	//예외 발생여부 상관없이 무조건 실행
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
