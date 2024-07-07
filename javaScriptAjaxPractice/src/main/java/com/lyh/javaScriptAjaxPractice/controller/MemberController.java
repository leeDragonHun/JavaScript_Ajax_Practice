package com.lyh.javaScriptAjaxPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyh.javaScriptAjaxPractice.mapper.MemberMapper;

import lombok.extern.slf4j.Slf4j;

// 페이지를 요청하는 게 있고 데이터를 요청하는 게있다.
// rest는 데이터를 요청하는 방식일 때 쓴다.
@RestController
@Transactional
@Slf4j
public class MemberController {

	@Autowired MemberMapper memberMapper;
	
	@PostMapping("/idCheck")
	public int idCheck(@RequestParam(name="id") String id) {
		String result = memberMapper.selectMemberById(id);
		// null(사용할 수 있는 아이디) 0, admin(사용할 수 없는 아이디) 1
		if(result == null) {
			return 0; // 방금 보낸 아이디로 회원가입 가능
		}
		return 1; // 회원가입 불가.
	}
}
