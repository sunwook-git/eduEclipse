package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopyUtil{
	//바이트 값을 가진 파일 1개를 복사하는 메서드
	public static void copyFile(File source, File dest) {
		
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			int bytesRead;
			while((bytesRead = input.read(buffer)) != -1) {
				output.write(buffer, 0, bytesRead);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
				output.close();
			} catch (Exception e2) {
			
			}
		}
	}
	public static void copyFile(String source, String dest) {
		File sourceFile = new File(source);
		File destFile = new File(dest);
		copyFile(sourceFile, destFile);
	}
	
}
