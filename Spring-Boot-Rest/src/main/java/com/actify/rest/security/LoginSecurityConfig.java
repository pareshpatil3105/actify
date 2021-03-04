package com.actify.rest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configure(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication()
		.passwordEncoder(new BCryptPasswordEncoder())
			.withUser("developer").password("$2a$10$hPkFzbV0uUXfETdsWW1TjOu40PRjCjBRTcxQ9bOdqWWll5cQrUCwS").roles("DEVELOPER")
			.and()
			.withUser("admin").password("$2a$10$7QdUvQhA.8HnK/Pyg9Uf3e5CzA9Zkh9HimwBNYbCAcH2xduG4LpSe").roles("ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http.authorizeRequests()
				 .antMatchers("/").permitAll()
				 .antMatchers("/deleteEmployee").hasAnyRole("DEVELOPER", "ADMIN")
			.antMatchers("/listAllEmployees").hasRole("ADMIN")
			.anyRequest().authenticated()
	        .and()
	        .httpBasic();; 
		
	}
}
