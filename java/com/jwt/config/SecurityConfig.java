/*
 * package com.jwt.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.http.SessionCreationPolicy; import
 * org.springframework.security.web.SecurityFilterChain; import
 * org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * 
 * import com.jwt.security.JwtAuthenticationEntryPoint; import
 * com.jwt.security.JwtAuthenticationFilter;
 * 
 * import jakarta.servlet.ServletException; import
 * jakarta.servlet.http.HttpServletRequest;
 * 
 * @Configuration public class SecurityConfig {
 * 
 * @Autowired private JwtAuthenticationEntryPoint authenticationEntryPoint;
 * 
 * @Autowired // private JwtAuthenticationFilter authenticationFilter;
 * 
 * @Bean SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)
 * throws Exception { httpSecurity.csrf(csrf -> csrf.disable()).cors(cors ->
 * cors.disable()) .authorizeHttpRequests( auth ->
 * auth.requestMatchers("/auth/**", "/token/validation").permitAll()
 * 
 * .requestMatchers("/api/expenses/**").authenticated() // ✅ Secure Expenses API
 * .anyRequest().authenticated()) .exceptionHandling(ex ->
 * ex.authenticationEntryPoint(authenticationEntryPoint))
 * .sessionManagement(session ->
 * session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
 * 
 * // Add JWT Filter before UsernamePasswordAuthenticationFilter
 * httpSecurity.addFilterBefore(authenticationFilter,
 * UsernamePasswordAuthenticationFilter.class);
 * 
 * return httpSecurity.build(); }
 * 
 * }
 */