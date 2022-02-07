package com.tritcorp.sbTest.scalaCode

import com.tritcorp.sbTest.scalaCode.MyServiceConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MyService @Autowired()(serviceConfig: MyServiceConfig) {
  def getMessage: String = {
    s"The service says: '${serviceConfig.someKey}'"
  }
}