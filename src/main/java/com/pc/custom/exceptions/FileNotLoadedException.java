package com.pc.custom.exceptions;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class FileNotLoadedException extends RuntimeException{
	
	public FileNotLoadedException(String message) {
        super(message);
    }

    public FileNotLoadedException(String message, Throwable cause) {
        super(message, cause);
    }

}
