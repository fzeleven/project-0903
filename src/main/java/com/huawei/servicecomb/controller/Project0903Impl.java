package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-03T03:49:50.953Z")

@RestSchema(schemaId = "project0903")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project0903Impl {

    @Autowired
    private Project0903Delegate userProject0903Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject0903Delegate.helloworld(name);
    }

}
