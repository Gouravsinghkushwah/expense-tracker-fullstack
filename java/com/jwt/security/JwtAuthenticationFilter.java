/*
 * package com.jwt.security;
 * 
 * import java.io.IOException; import java.nio.charset.MalformedInputException;
 * import java.nio.file.attribute.UserDefinedFileAttributeView;
 * 
 * import org.apache.tomcat.util.http.parser.Authorization; import
 * org.slf4j.Logger;
 * 
 * import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.security.core.context.SecurityContextHolder; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter; import
 * org.springframework.security.web.authentication.WebAuthenticationDetails;
 * import org.springframework.security.web.authentication.
 * WebAuthenticationDetailsSource; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.context.support.RequestHandledEvent; import
 * org.springframework.web.filter.OncePerRequestFilter;
 * 
 * import io.jsonwebtoken.ExpiredJwtException; import
 * io.jsonwebtoken.MalformedJwtException; import jakarta.servlet.FilterChain;
 * import jakarta.servlet.ServletException; import
 * jakarta.servlet.http.HttpServletRequest; import
 * jakarta.servlet.http.HttpServletResponse;
 * 
 * @Service public class JwtAuthenticationFilter extends OncePerRequestFilter {
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * private Logger logger = LoggerFactory.getLogger(OncePerRequestFilter.class);
 * 
 * @Autowired private JwtHelper jwtHelper;
 * 
 * 
 * @Autowired private UserDetailsService userDetailsService;
 * 
 * 
 * // @Override // protected boolean shouldNotFilter(HttpServletRequest request)
 * throws ServletException { // return
 * request.getRequestURI().startsWith("/auth") ||
 * request.getRequestURI().startsWith("/token/validation"); // } //
 * 
 * @Override protected void doFilterInternal(HttpServletRequest request,
 * HttpServletResponse response, FilterChain filterChain) throws
 * ServletException, IOException {
 * 
 * // Authorization Bearer 2352345235sdfrsfgsdfsdf
 * 
 * String requHeader = request.getHeader("Authorization");
 * 
 * logger.info(" Header : {}", requHeader); String username = null; String token
 * = null;
 * 
 * if(requHeader !=null && requHeader.startsWith("Bearer")) { // Looking Good
 * token = requHeader.substring(7);
 * 
 * try { username = this.jwtHelper.getUsernameFromToken(token);
 * 
 * } catch(IllegalArgumentException e) {
 * logger.info("IllegalArgument while fetching the username !!");
 * e.printStackTrace(); } catch(ExpiredJwtException e) {
 * logger.info("Given jwt token is expired !!"); e.printStackTrace(); }
 * catch(MalformedJwtException e) {
 * logger.info("Some changed has done in token !! Invalid Token");
 * e.printStackTrace(); } catch(Exception e) { e.printStackTrace(); } } else {
 * logger.info("Invalid Header Value"); }
 * 
 * if(username != null && SecurityContextHolder.getContext().getAuthentication()
 * == null) { UserDetails userDetails =
 * this.userDetailsService.loadUserByUsername(username); Boolean validToken =
 * this.jwtHelper.validateToken(token, userDetails);
 * 
 * if(validToken) { UsernamePasswordAuthenticationToken authenticationToken =
 * new UsernamePasswordAuthenticationToken(userDetails,null,
 * userDetails.getAuthorities()); authenticationToken.setDetails(new
 * WebAuthenticationDetailsSource().buildDetails(request));
 * SecurityContextHolder.getContext().setAuthentication(authenticationToken); }
 * else { logger.info("Validation fails !!"); } }
 * 
 * filterChain.doFilter(request, response);
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 */