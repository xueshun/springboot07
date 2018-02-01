package com.xue.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(ErrorExceptionHandler.class);
	
	/**
	 *统一异常处理(自定义异常)
	 * @param exception
	 * @return
	 */
	@ExceptionHandler({RuntimeException.class})
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(RuntimeException exception) {
		logger.info("自定义异常-RuntimeException");
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception",exception.getMessage());
		mv.setViewName("error/500");
		return mv;
	}
	
	/**
	 * 统一异常处理
	 * @param exception
	 * @return
	 */
	@ExceptionHandler({Exception.class})
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(Exception exception) {
		logger.info("自定义异常处理-Exception");
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception",exception.getMessage());
		mv.setViewName("error/500");
		return mv;
	}
}
