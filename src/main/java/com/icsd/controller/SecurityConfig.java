package com.icsd.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
    public void configure(HttpSecurity http) throws Exception {
		//In this, we configure which end points are required or which are not
        http
                .antMatcher("/**").authorizeRequests() //Here, * is an astrich
                //These end point are required to user login in
//                .antMatchers(..antPatterns:"/").permitAll()
                .antMatchers(new String[]{"/", "/not-restricted"}).permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }

}
