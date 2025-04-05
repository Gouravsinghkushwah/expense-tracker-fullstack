/*
 * package com.expense.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.jwt.security.JwtHelper;
 * 
 * @RestController
 * 
 * @RequestMapping("/token") public class TokenValidationController {
 * 
 * @Autowired // private JwtHelper helper;
 * 
 * @Autowired private UserDetailsService userDetailsService;
 * 
 * 
 * 
 * 
 * 
 * @PostMapping("/validation") public ResponseEntity<String>
 * validateToken(@RequestBody String token){ System.out.println(token
 * +" T---------------------");
 * 
 * try { String username = helper.getUsernameFromToken(token);
 * System.out.println(username);
 * 
 * UserDetails details = userDetailsService.loadUserByUsername(username);
 * System.out.println(details);
 * 
 * boolean isValid = helper.validateToken(token, details);
 * 
 * if(isValid) { return ResponseEntity.ok("Valid token hai"); } else { return
 * ResponseEntity.status(401).body("Invalid hai token"); } } catch(Exception e)
 * { return ResponseEntity.status(401).body("Invalid Token"); }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 */