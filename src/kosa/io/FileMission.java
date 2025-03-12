package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMission {

	public static void main(String[] args) {
		//1. 바이트스트림을 이용하여 이미지 파일을 복사해보자
		String source = "D:\\etc\\image.png";
		String dest = "D:\\etc\\etc2\\image.png";
		
		
		//source,dest가 String이므로 File 객체로 바꿔줘야함
		CopyUtil.copyFile(source ,dest);

		}
	}

