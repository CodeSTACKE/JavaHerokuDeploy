package com.heroku.hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHeroku {

    @RequestMapping(value="/hello", method= RequestMethod.GET)

    public String greet(){
        String msg="Hello Heroku";
        return msg;
    }
    @RequestMapping(value="/hi/{name}",method=RequestMethod.GET)
    public String returnGreet(@PathVariable String name){
        return name;
    }

}
