package com.example.oauthresourceserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Connor
 * @Date 2022-11-22 週二  21:55:37
 */
@RestController
public class HomeController {
   @RequestMapping("/home")
   public String home(){
      return "test";
   }
}
