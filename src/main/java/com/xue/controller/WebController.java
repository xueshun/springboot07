package com.xue.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/web")
public class WebController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebController.class);
	
	@RequestMapping(value = "index")
	public String index(ModelMap map) {
		map.put("title", "freemarker hello word");
		return "index"; // 开头不要加上/，linux下面会出错
	}
	
	@RequestMapping(value="error")
	public String error(ModelMap map) {
		throw new RuntimeException("测试异常");
	}
}
