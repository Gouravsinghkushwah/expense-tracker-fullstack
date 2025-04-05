/*
 * package com.jwt.controller;
 * 
 * import java.security.Principal; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.jwt.service.USerService; import com.jwt.service.model.User;
 * 
 * @RestController
 * 
 * @RequestMapping("/home") public class HomeController {
 * 
 * @Autowired private USerService userService;
 * 
 * 
 * 
 * 
 * 
 * 
 * @GetMapping("/users") public List<User> getUser() {
 * System.out.println("Getting Users"); return this.userService.getUser(); }
 * 
 * @GetMapping("/current-user") public String getLoggedInUser(Principal
 * principal) { return principal.getName(); }
 * 
 * 
 * }
 */