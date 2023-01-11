package com.hcl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hcl.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
@CrossOrigin
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	protected void configure(HttpSecurity http) throws Exception {

		http
		.csrf().disable()
		.authorizeHttpRequests()
		.antMatchers("/foodCrud/**").hasRole("ADMIN")
		.antMatchers("/register").permitAll()
				.anyRequest()
					.authenticated()
						.and()
							.formLogin();

	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//		auth.inMemoryAuthentication().withUser("Suhail").password(this.passwordEncoder().encode("123")).roles("EMPLOYEE");
//		auth.inMemoryAuthentication().withUser("Shalini").password(this.passwordEncoder().encode("234")).roles("ADMIN");
		
		auth.userDetailsService(customUserDetailsService).passwordEncoder(this.passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("Inside PasswordEncoder()...");
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		
//		return NoOpPasswordEncoder.getInstance();
//	}

}
