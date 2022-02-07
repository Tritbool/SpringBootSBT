package com.tritcorp.sbTest.javaCode;

import com.tritcorp.sbTest.scalaCode.MyServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceJava {
    @Autowired
    MyServiceConfig conf;

    public String getMessage() {
        return "The java service says: " + conf.getKey();
    }
}
