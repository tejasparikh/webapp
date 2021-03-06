package com.csye6225.demo.controllers;


import com.google.gson.JsonObject;
import com.timgroup.statsd.StatsDClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class HomeController {

  private final static Logger logger = LoggerFactory.getLogger(HomeController.class);


  @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
  @ResponseBody
  public String welcome() {

    JsonObject jsonObject = new JsonObject();

    jsonObject.addProperty("message", "Current time is " + new Date().toString());

    return jsonObject.toString();
  }

}
