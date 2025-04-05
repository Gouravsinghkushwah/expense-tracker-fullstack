
  package com.jwt.service;
  
  import java.util.ArrayList; import java.util.List; import java.util.UUID;
  
  import org.springframework.stereotype.Service;
  
  import com.jwt.service.model.User;
  
  @Service public class USerService {
  
  private List<User> ul = new ArrayList<>();
  
  
  
  
  
  
  
  
  public USerService() { ul.add(new
  User(UUID.randomUUID().toString(),"Pawan","pawam@gmail.com")); ul.add(new
  User(UUID.randomUUID().toString(),"Sumit","sumit@gmail.com")); ul.add(new
  User(UUID.randomUUID().toString(),"kalu","kalu@gmail.com")); ul.add(new
  User(UUID.randomUUID().toString(),"poonam","poonam@gmail.com")); }
  
  
  public List<User> getUser() { return this.ul; } }
 
