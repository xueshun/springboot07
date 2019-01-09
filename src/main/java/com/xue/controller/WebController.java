package com.xue.controller;

import com.xue.dto.Student;
import com.xue.example01.JSON;
import com.xue.json.JsonPropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/web")
public class WebController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebController.class);
	
	@RequestMapping(value = "index")
	public String index(ModelMap map) {
		map.put("title", "freemarker hello word");
		//开头不要加上/，linux下面会出错
		return "index";
	}


	@RequestMapping(value = "getStudents",method = RequestMethod.GET)
	@ResponseBody
	@JSON(type = Student.class,filter = "address")
	public List<Student> getStudents(){
		List<Student> studentList = new ArrayList<>();
		Student stu;
		for (int i = 0; i < 10; i++) {
			stu = new Student(i,"stu"+i,i+6,"杭州"+i);
			studentList.add(stu);
		}
		return studentList;
	}


	@RequestMapping(value="error")
	public String error(ModelMap map) {
		throw new RuntimeException("测试异常");
	}
}
