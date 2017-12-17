package com.example.fastpassservice.fastpassservice;

public class FastPassNotFound extends RuntimeException {

    private String fastPassId;

    public FastPassNotFound(String fastPassId) {
        super();
    }
}
