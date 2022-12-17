package com.exception;

import java.util.function.Supplier;

public class CustomException extends RuntimeException {

    public CustomException(String message){
        super(message);
    }

}
