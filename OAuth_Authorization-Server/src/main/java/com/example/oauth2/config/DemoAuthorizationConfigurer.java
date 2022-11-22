package com.example.oauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @author Connor
 * @Date 2022-11-17 週四  20:21:22
 */
@Configuration
public class DemoAuthorizationConfigurer extends AuthorizationServerConfigurerAdapter {
  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private UserDetailsService userDetailsService;

  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients.inMemory()
        .withClient("spring")
        .secret("{noop}spring_secret")
//        .resourceIds("resource")
        .authorizedGrantTypes("refresh_token", "password", "client_credentials")
        .scopes("webclient", "mobile_client");
  }

  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints.authenticationManager(authenticationManager).userDetailsService(userDetailsService);
  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
   security.checkTokenAccess("isAuthenticated()");
  }
}
