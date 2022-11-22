package com.example.oauth2.contorller;

import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Connor
 * @Date 2022-11-22 週二  20:40:34
 */
@RestController
public class UserController {

  @RequestMapping("/userinfo")
  public Principal user(Principal user){
    return user;
  }
}
