package com.example.oauthresourceserver.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;

/**
 * @author Connor
 * @Date 2022-11-21 週一  22:41:14
 */
@Configuration
public class DemoResourceServerConfigurer extends ResourceServerConfigurerAdapter {

//  @Override
//  public void configure(HttpSecurity http) throws Exception {
//    http
//        .authorizeHttpRequests().anyRequest().authenticated();
//  }

}
