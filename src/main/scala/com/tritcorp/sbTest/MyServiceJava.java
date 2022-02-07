package com.tritcorp.sbTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceJava {
    @Autowired
    MyServiceConfig conf;

    String getMessage() {
        return "The java service says: " + conf.getKey();
    }
}
