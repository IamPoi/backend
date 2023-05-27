package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarketDTO;
import com.example.demo.service.SearchService;

@RestController
@RequestMapping("/")
public class SearchController {

	@Autowired
	private SearchService searchService;

	@GetMapping("search")
//	public String search(@RequestParam Map<String, Object> map, Model model) {
	public Map search(@RequestParam Map<String, Object> map, Model model) {
		
		Map<String, Object> result = new HashMap<>();

		String word = map.get("word") != null ? (String) map.get("word") : "";
		System.out.println(word + "검색");

		NaverAPI api = new NaverAPI();

		String clientId = "T6gVmvD4P4so_OCOFrUF"; // 애플리케이션 클라이언트 아이디
		String clientSecret = "dAAmKCgT_s"; // 애플리케이션 클라이언트 시크릿

		String text = word;

		try {
			text = URLEncoder.encode("그린팩토리", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("검색어 인코딩 실패", e);
		}

		String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text; // JSON 결과
		// String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text;
		// // XML 결과

		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		String responseBody = api.get(apiURL, requestHeaders);
		
		System.out.println("-----------------------------------------");
		System.out.println(responseBody);
		System.out.println("-----------------------------------------");

		ArrayList<MarketDTO> searchList = new ArrayList<>();

		MarketDTO dto = new MarketDTO("fail");

		if (word.length() >= 2) {

			try {

				searchList = searchService.searchList(word);

				if (searchList.size() == 0) {
					searchList.add(dto);
					System.out.println("리스트 없음");
				} else {
					System.out.println("검색 성공");
				}

			} catch (Exception e) {
				System.out.println("실패");
				searchList.add(dto);
			}
		} else {
			searchList.add(dto);
		}
		
		

		return result;

	}

}
