package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMission {

	public static void main(String[] args) {
		//1. ����Ʈ��Ʈ���� �̿��Ͽ� �̹��� ������ �����غ���
		String source = "D:\\etc\\image.png";
		String dest = "D:\\etc\\etc2\\image.png";
		
		
		//source,dest�� String�̹Ƿ� File ��ü�� �ٲ������
		CopyUtil.copyFile(source ,dest);

		}
	}

