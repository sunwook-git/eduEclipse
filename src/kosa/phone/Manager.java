package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	// 전화번호 목록을 관리하는 기능(추가, 출력, 검색 등등)

	// 여러개의 PhoneInfo 객체를 관리하기 위하여 배열사용 (Manager 객체를 생성할때 메모리 올라옴)
	//private PhoneInfo arr[];  => List로 자료구조 변경  
	private int count;
	List<PhoneInfo> list;

	// 기본 생성자 : 매개변수를 받을 필요 없으므로 기본 생성자에서
	public Manager() {
		list = new ArrayList<PhoneInfo>();		
	}

	// 전화번호 추가
	public void addPhoneInfo() {
		// 1.전체 2.동창 3.직장
		System.out.println("1.일반 2.동창 3.직장");
		System.out.print("메뉴선택 : ");
		String menu = DataInput.sc.nextLine();

		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();

		switch (menu) {
		case "1":			
			list.add(new PhoneInfo(name, phoneNo, birth));
			break;
		case "2":
			System.out.print("전공 : ");
			String major = DataInput.sc.nextLine();
			System.out.print("학년 : ");
			String year = DataInput.sc.nextLine();
			
			list.add(new Universe(name, phoneNo, birth, major, year));
			break;
		case "3":
			System.out.print("부서 : ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직급 : ");
			String position = DataInput.sc.nextLine();

			list.add(new Company(name, phoneNo, birth, dept, position));
			break;
		}

		// 메세지 출력
		System.out.println("전화번호가 등록 되었습니다.");
		}

	// 전체 목록 출력(phoneinfo에서 한 객체에 대한 내용 출력을 하는 show메서드를 가져와서 전체목록을 출력)
	public void listPhoneInfo() {
		// 1.전체 2.동창 3.직장
		System.out.println("1.일반 2.동창 3.직장");
		System.out.print("메뉴 선택: ");
		String choise = DataInput.sc.nextLine();

		switch (choise) {
		case "1":
			System.out.println("**전체목록**");
			Iterator<PhoneInfo> iter = list.iterator();
			while(iter.hasNext()) {
				iter.next().show();
			}
			break;
		case "2":
			System.out.println("**동창목록**");
			for (int i = 0; i < list.size(); i++) {
				PhoneInfo info = list.get(i);
				if (info instanceof Universe) {
					info.show();
				}
			}
			break;
		case "3":
			System.out.println("**직장목록**");
			for (int i = 0; i < list.size(); i++) {
				PhoneInfo info = list.get(i);
				if (info instanceof Company) {
					info.show();
				}
			}
			break;
		}
	}

	// 검색하고자 하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력(찾지 못하였으면 찾지 못했다는 메세지 출력)
	public void searchPhoneInfo() {
		System.out.print("이름 검색 : ");
		String target = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (target.equals(info.getName())) {
				info.show();
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("Not Found");
		}
	}

	// 전화번호 수정
	public void updatePhoneInfo() {
		
		//이름을 입력 => 해당 PhoneInfo 검색 => 수정 전화번호 => 전화번호 수정이 완료
		System.out.print("이름 입력 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				System.out.print("수정할 전화번호: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
			}
		}
		
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}

	// 삭제
	public void deletePhoneInfo() {
		
		//이름을 입력 => 해당 PhoneInfo객체 검색 -> 인덱스를 찾기 -> 해당 객체 삭제
		System.out.print("이름 입력 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				list.remove(info);				
				idx = i;
			}	
		}
		//idx값이 -1이 아니면 삭제할 인덱스가 있으므로 else에 작성
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
	// 저장
	public void savePhoneInfo() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneinfo.txt"));
			oos.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	//불러오기
	public void loadPhoneInfo() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneinfo.txt"));
			list = (List)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
			
			}
		}
	}
	
}
