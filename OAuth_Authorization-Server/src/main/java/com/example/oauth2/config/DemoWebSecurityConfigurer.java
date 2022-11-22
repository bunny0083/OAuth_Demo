package com.example.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Connor
 * @Date 2022-11-17 週四  20:35:37
 */
@Configuration
public class DemoWebSecurityConfigurer extends WebSecurityConfigurerAdapter {
   @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth.inMemoryAuthentication()
          .withUser("user").password("{noop}password1").roles("USER")
          .and()
          .withUser("admin").password("{noop}password2").roles("USER", "ADMIN");
   }

   @Bean
   @Override
   public UserDetailsService userDetailsServiceBean() throws Exception {
      return super.userDetailsServiceBean();
   }

   @Bean
   @Override
   public AuthenticationManager authenticationManagerBean() throws Exception {
      return super.authenticationManagerBean();
   }
}
