
  package com.jwt.service.model;
  
  import lombok.Data;
 
  @Data public class User {
  
  public User(String id, String name, String email) { this.id = id; this.name =
  name; this.email = email;
  
  } private String id; private String name; private String email; }
 
