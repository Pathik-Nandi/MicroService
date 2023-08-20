package com.microservice.hotel.exception;

public class ResourceNotFoudException extends RuntimeException{
    public ResourceNotFoudException(String s){
        super(s);
    }
    public ResourceNotFoudException(){
        super("Resource Not Found!");
    }
}
