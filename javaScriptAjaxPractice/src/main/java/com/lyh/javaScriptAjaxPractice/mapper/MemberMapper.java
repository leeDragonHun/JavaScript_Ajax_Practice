package com.lyh.javaScriptAjaxPractice.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	String selectMemberById(String id);
}
