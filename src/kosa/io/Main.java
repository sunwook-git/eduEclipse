package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	Member m;
	
	//객체 직렬화(객체 => 파일)
	public void inser() {
		m = new Member("홍길동");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	//객체 역직렬화(파일(객체) -> 프로그램(객체))
	public void show() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Main mm = new Main();
		mm.inser();
		mm.m = null;
		mm.show(); 		//역직렬화
		
		System.out.println(mm.m);
	}
}
