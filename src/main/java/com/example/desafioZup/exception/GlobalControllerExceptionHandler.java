package com.example.desafioZup.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

	@ExceptionHandler(value = { ConstraintViolationException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public DefaultError constraintViolationException(ConstraintViolationException ex) {
		return new DefaultError(500, 5001, "Erro ao solicitar a requisição");
	}

	@ExceptionHandler(value = { NoHandlerFoundException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public DefaultError noHandlerFoundException(Exception ex) {
		return new DefaultError(404, 4041, "O servidor não pôde encontrar o que foi pedido");
	}

	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public DefaultError unknownException(Exception ex) {
		return new DefaultError(500, 5002, "Erro ao solicitar a requisição");
	}
}
