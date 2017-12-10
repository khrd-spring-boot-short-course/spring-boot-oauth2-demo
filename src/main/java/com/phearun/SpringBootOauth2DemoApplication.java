package com.phearun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.phearun.model.CustomUserDetails;
import com.phearun.repository.UserRepository;

@SpringBootApplication
public class SpringBootOauth2DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauth2DemoApplication.class, args);
	}
	
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception{
		System.out.println("~AuthenticationManagerBuilder~");
		
		//if(repo.count()==0)
		//	repo.save(new User(null, "user", "user", Arrays.asList(new Role(null, "USER"), new Role(null, "ACTUATOR"))));
		
		builder.userDetailsService(new UserDetailsService() {
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				System.out.println("username: " + username);
				return new CustomUserDetails(repo.findByUsername(username));
			}
		});
	}
}
