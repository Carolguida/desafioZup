package com.example.desafioZup.exception;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class DefaultError {

	private int code;
	private String message;
	private int status;
	

	public DefaultError() {
	}

	public DefaultError(int status, int code, String message) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
	}

	//Getters and Setters
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
    public String toString() {
        return "DefaultError{" +
                "status=" + status +
                ", code=" + code +
                ", message=" + message +
                '}';
    }

}

