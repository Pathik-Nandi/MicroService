package com.miroservice.user.service.UserService.exception;

 public class ResourceNotFoundException extends java.lang.RuntimeException {
    public ResourceNotFoundException(){
        super("Resource not found on server !!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
