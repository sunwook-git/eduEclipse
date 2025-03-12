package kosa.io;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		String path = "D:\\etc";
		
		File f = new File(path);
		show(f);
//		if (f.isDirectory()) {
//			System.out.println("디렉토리");
//		} else {
//			System.out.println("파일");
//		}
	}
	
	public static void show(File file) {
		File list[] = file.listFiles();	//폴더안에 있는 목록들을 파일객체로 만듬(etc밑에 있는 목록들)
		
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println();
				System.out.println("*** " + list[i].getName() + " ***");
				show(list[i]);
			}else {
				System.out.println(" - " + list[i].getName());
			}
		}
	}
}
