package com.main.config;

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{
	
	@Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().withClient("javainuse").secret("secret").authorizedGrantTypes("authorization_code")
            .scopes("read").authorities("CLIENT");
    }

}
