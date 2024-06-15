package com.lyh.javaScriptAjaxPractice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyh.javaScriptAjaxPractice.mapper.SubMapper;

@RestController
public class SubController {
	@Autowired SubMapper subMapper;
	
	@PostMapping("/large")
	public List<String> large() {
		return subMapper.selectLargeName();
	}
	
	@PostMapping("/medium")
	public List<Map<String, Object>> medium(@RequestParam(name="largeName") String largeName) {
		return subMapper.selectMediumName(largeName);
	}
	
	@PostMapping("/small")
	public List<Map<String, Object>> small(@RequestParam(name="mediumNo") int mediumNo) {
		return subMapper.selectSmallName(mediumNo);
	}
}
