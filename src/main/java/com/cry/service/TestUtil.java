package com.cry.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "test")
public class TestUtil {

    private static final String MOCK = "testutil";

    private String mock = MOCK;

    public String fucntion(){
        return mock;
    }

    public String getMock() {
        return mock;
    }

    public void setMock(String mock) {
        this.mock = mock;
    }
}
