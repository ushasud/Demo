package com.drastin;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MainAppTest<Client, WebResource> {
    private static String HELLO_URL = "http://localhost:8088";

    @Test
    public void testHello() throws Exception {
        String test = "Hello World";
        Assert.assertEquals(test, "Hello World");
    }
}