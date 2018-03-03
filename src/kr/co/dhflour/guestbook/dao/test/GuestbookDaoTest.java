package kr.co.dhflour.guestbook.dao.test;

import java.util.ArrayList;
import kr.co.dhflour.guestbook.dao.GuestbookDao;
import kr.co.dhflour.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		//insertTest();
		deleteTest();
		fetchListTest();
		
	}
	
	// 입력
	public static void insertTest() {
		GuestbookDao dao = new GuestbookDao();
		
		GuestbookVo vo = new GuestbookVo();
		vo.setName("홍길동");
		vo.setPassword("1234");
		vo.setContents("테스트");
		
		dao.insert(vo);
	}
	
	// 삭제
	public static void deleteTest() {
		GuestbookDao dao = new GuestbookDao();
		
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(3);
		vo.setPassword("1234");
		
		dao.delete(vo);
	}
	
	// 조회 리스트
	public static void fetchListTest() {
		GuestbookDao dao = new GuestbookDao() ;
		ArrayList<GuestbookVo> list = dao.fetchList();
		
		//순회
		/*int count = list.size();
		for(int i = 0; i < count; i++) {
			EmailListVo vo = list.get(i);
			System.out.println(vo);
		}*/
		
		//순회2
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}

}
