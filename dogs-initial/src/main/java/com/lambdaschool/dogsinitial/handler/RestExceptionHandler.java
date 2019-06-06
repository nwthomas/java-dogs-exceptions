package com.lambdaschool.dogsinitial.handler;

import com.lambdaschool.dogsinitial.exception.ResourceNotFoundException;
import com.lambdaschool.dogsinitial.model.ErrorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler
{
	@Autowired
	private MessageSource messageSource;

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request)
	{
		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setTimestamp(new Date().getTime());

	}
}
