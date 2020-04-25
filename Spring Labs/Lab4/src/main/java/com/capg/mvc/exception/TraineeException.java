package com.capg.mvc.exception;

public class TraineeException  extends RuntimeException {

    public TraineeException(String arg0) {
        super(arg0);
        System.err.println(arg0);
        
    }

}