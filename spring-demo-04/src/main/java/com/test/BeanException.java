package com.test;

import java.security.PublicKey;

public class BeanException extends RuntimeException{

    public BeanException(String msg){
        super(msg);
    }

    public BeanException(String msg, Throwable cause){
        super(msg, cause);
    }
}
