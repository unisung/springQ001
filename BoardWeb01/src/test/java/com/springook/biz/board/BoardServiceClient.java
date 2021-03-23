package com.springook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
	//1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
    //2. Sring 컨테이너로 부터 BoardServiceImpl객체 얻기
		BoardService boardService = (BoardService)container.getBean("boardService");
		
	//3. 글 등록 기능 테스트
		
	
 	//4. spring 컨테이너 종료	
        container.close();
	}

}
