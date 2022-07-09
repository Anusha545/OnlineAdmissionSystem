package com.capgemini.sprint;

import java.time.LocalDateTime;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.sprint.exception.ErrorMessage;
import com.capgemini.sprint.exception.InvalidUniversityException;
import com.capgemini.sprint.exception.UniversityCreationException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(InvalidUniversityException.class)
	public @ResponseBody ErrorMessage checkInvalidUniversityException(InvalidUniversityException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		return error1;
	}
	@ExceptionHandler(UniversityCreationException.class)
	public @ResponseBody ErrorMessage checkUniversityCreationException(UniversityCreationException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		return error1;
	}
	
	
		
	
	//validation
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ErrorMessage checkUniversityValidation(MethodArgumentNotValidException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage(),e.getBindingResult().toString());
		return error1;
	}
	
	
}
	
		 
	



