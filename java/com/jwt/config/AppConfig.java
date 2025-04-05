  package com.jwt.config;
  
  import java.beans.BeanProperty; import java.net.Authenticator;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.security.authentication.AuthenticationManager; import
  org.springframework.security.config.annotation.authentication.configuration.
  AuthenticationConfiguration; import
  org.springframework.security.core.userdetails.User; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
  org.springframework.security.crypto.password.PasswordEncoder; import
  org.springframework.security.provisioning.InMemoryUserDetailsManager;
  
  @Configuration public class AppConfig {
  






   
 @Bean UserDetailsService detailsService() {
 
 UserDetails userDetails =
  User.builder().username("gourav").password(passwordEncoder().encode("gourav")
  ).roles("ADMIN").build();
  
  return new InMemoryUserDetailsManager(userDetails); }
  
  @Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder();
  }
  
  
  @Bean AuthenticationManager authenticationManager(AuthenticationConfiguration
  builder) throws Exception { return builder.getAuthenticationManager(); }
  
  
  
  }
