package com.cry.service;


public class UtilService {
    TestUtil testUtil;
    public UtilService(){
        testUtil = new TestUtil();
    }

    public String stringMockAware(){
        return testUtil.fucntion();
    }

    public TestUtil getTestUtil() {
        return testUtil;
    }

    public void setTestUtil(TestUtil testUtil) {
        this.testUtil = testUtil;
    }
}
