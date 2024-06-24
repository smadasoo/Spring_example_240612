package com.example.lesson05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("멜론");
		fruits.add("포도");
		fruits.add("복숭아");
		fruits.add("딸기");
		// 리스트를 만들고사용하면 안됨 model에 담아야한다
		model.addAttribute("fruits", fruits);
		// 클래스 객체 개념 (list ,map)을 자주 공부해줘야한
		// List<Map<String, Object>>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name","최승은");
		user.put("age","27");
		user.put("hobby","영화보기");
		// users.add를 해줘야 리스트가 의미가 있다
		users.add(user);
		
		user = new HashMap<>();
		user.put("name","조경아");
		user.put("age","31");
		user.put("hobby","낚시");
		users.add(user); // 생성된 리스트 이름 users
									// 반드시 리스트 이름으로 해주어야한다
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
		@GetMapping("/ex03")
		public String ex03(Model model) {
			Date date = new Date();
			model.addAttribute("date", date);
			
			LocalDate localDate  = LocalDate.now();
			model.addAttribute("localDate", localDate);
			
			
			LocalDateTime localDateTime = LocalDateTime.now();
			model.addAttribute("localDateTime", localDateTime);
			
			// UTC 표준시 
			ZonedDateTime zondedDateTime = ZonedDateTime.now();
			model.addAttribute("localDateTime", localDateTime);
			
			return "lesson05/ex03";
		}
	
	}

