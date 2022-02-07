package com.tritcorp.sbTest.scalaCode

import com.tritcorp.sbTest.javaCode._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
class MyServiceController @Autowired()(myService: MyServiceJava) {

  @RequestMapping(path = Array("/testScalaJava"), method = Array(RequestMethod.GET), produces = Array(MediaType.TEXT_PLAIN_VALUE))
  @ResponseBody
  def handleRequest(): String = {
    s"Hallo from a Scala controller! ${myService.getMessage}"
  }

}
