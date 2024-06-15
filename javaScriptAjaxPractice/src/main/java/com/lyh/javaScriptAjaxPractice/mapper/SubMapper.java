package com.lyh.javaScriptAjaxPractice.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubMapper {
	List<String> selectLargeName();
	List<Map<String, Object>> selectMediumName(String largeName);
	List<Map<String, Object>> selectSmallName(int mediumNo);
}
