package com.rudra.spring3.security;
 
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
 
	
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        System.out.println("running from custom");
        try {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (!username.equals("admin")) {
            throw new BadCredentialsException("Username not found.");
        }
 
        if (!password.equals("oothink1988")) {
            throw new BadCredentialsException("Wrong password.");
        }
 
        List<Role> roles = new LinkedList<Role>();
        Role role = new Role();
        role.setName("ROLE_USER");
        roles.add(role);

   		User user = new User("admin", "oothink1988", roles);
        return new UsernamePasswordAuthenticationToken(user, password, roles);
    }
 
    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }
}