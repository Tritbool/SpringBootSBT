package com.tritcorp.sbTest.javaCode;
import com.tritcorp.sbTest.javaCode.*;
import com.tritcorp.sbTest.scalaCode.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyServiceControllerJava {
    @Autowired
    MyService myService;
    @RequestMapping(path = "/testJavaScala", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String handleRequest(){
        return "Hallo from a Java controller! " + myService.getMessage();
    }

}
