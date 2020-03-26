package com.just.myblog.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.just.myblog.dto.JsonData;

//@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public JsonData handlerError(Exception e) {
		// MessageBean一个前后台交互的Json实体类，包括success，msg，data属性

		return JsonData.buildException(500, e.getMessage());
	}

}