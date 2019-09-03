package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject0903 {

        Project0903Delegate project0903Delegate = new Project0903Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project0903Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}