
  package com.jwt.controller;
  
  
  import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.http.HttpStatus; import
  org.springframework.http.ResponseEntity; import
  org.springframework.security.authentication.AuthenticationManager; import
  org.springframework.security.authentication.BadCredentialsException; import
  org.springframework.security.authentication.
  UsernamePasswordAuthenticationToken; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.web.bind.annotation.ExceptionHandler; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RestController;
  
  import com.jwt.security.JwtHelper; import com.jwt.service.model.JwtRequest;
  import com.jwt.service.model.JwtResponse;
  
  @RestController
  
  @RequestMapping("/auth") public class AuthController {
  
  
  
  
  
  @Autowired private UserDetailsService userdetailsService;
  
  @Autowired private AuthenticationManager authenticationManager;
  
  @Autowired private JwtHelper helper;
  
  private Logger logger = LoggerFactory.getLogger(AuthController.class);
  
  
  @PostMapping("/login") public ResponseEntity<JwtResponse> login(@RequestBody
  JwtRequest jwtRequest) { this.doAuthenticate(jwtRequest.getEmail(),
  jwtRequest.getPassword()); UserDetails userDetails =
  userdetailsService.loadUserByUsername(jwtRequest.getEmail()); String token =
  this.helper.generateToken(userDetails);
  
  JwtResponse Response = JwtResponse.builder() .token(token)
  .username(userDetails.getUsername()).build(); return new
  ResponseEntity<>(Response,HttpStatus.OK); }
  
  
  private void doAuthenticate(String email, String password) {
  
  UsernamePasswordAuthenticationToken authenticationToken = new
  UsernamePasswordAuthenticationToken(email, password);
  
  try { authenticationManager.authenticate(authenticationToken); } catch
  (BadCredentialsException e) {
  
  throw new BadCredentialsException("Invalid username or password!!"); }
  
  }
  
  @ExceptionHandler(BadCredentialsException.class) public String
  exceptionHandler() { return "CredentionInvalid"; 
                     } }
 
