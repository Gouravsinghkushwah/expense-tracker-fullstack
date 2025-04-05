/*
 * package com.jwt.security;
 * 
 * import java.nio.charset.StandardCharsets; import java.util.Date; import
 * java.util.HashMap; import java.util.Map; import java.util.function.Function;
 * // ✅ Use correct Function interface
 * 
 * import javax.crypto.SecretKey;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.stereotype.Component;
 * 
 * import io.jsonwebtoken.Claims; import io.jsonwebtoken.Jwts; import
 * io.jsonwebtoken.SignatureAlgorithm; import io.jsonwebtoken.security.Keys;
 * 
 * @Component public class JwtHelper {
 * 
 * public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60; // 5 hours
 * 
 * // private SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
 * 
 * 
 * 
 * private final SecretKey secretKey;
 * 
 * public JwtHelper(@Value("${jwt.secret}") String secret) { this.secretKey =
 * Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)); }
 * 
 * public SecretKey getSecretKey() { return secretKey; }
 * 
 * 
 * public String getUsernameFromToken(String token) { return
 * getClaimFromToken(token, Claims::getSubject); }
 * 
 * public Date getExpirationDateFromToken(String token) { return
 * getClaimFromToken(token, Claims::getExpiration); }
 * 
 * public <T> T getClaimFromToken(String token, Function<Claims, T>
 * claimResolver) { final Claims claims = getAllClaimsFromToken(token); return
 * claimResolver.apply(claims); }
 * 
 * // Get all claims from token private Claims getAllClaimsFromToken(String
 * token) { return Jwts.parser() .setSigningKey(secretKey)
 * .parseClaimsJws(token) .getBody(); }
 * 
 * // Check if token has expired private boolean isTokenExpired(String token) {
 * final Date expiration = getExpirationDateFromToken(token); return
 * expiration.before(new Date()); }
 * 
 * // ✅ Removed incomplete method (`public` without body)
 * 
 * // Generate token for user public String generateToken(UserDetails
 * userDetails) { Map<String, Object> claims = new HashMap<>(); return
 * doGenerateToken(claims, userDetails.getUsername()); }
 * 
 * private String doGenerateToken(Map<String, Object> claims, String subject) {
 * return Jwts.builder() .setClaims(claims) .setSubject(subject)
 * .setIssuedAt(new Date(System.currentTimeMillis())) .setExpiration(new
 * Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
 * .signWith(SignatureAlgorithm.HS512, secretKey) .compact(); }
 * 
 * // Validate JWT token public boolean validateToken(String token, UserDetails
 * userDetails) { final String username = getUsernameFromToken(token); // ✅
 * Fixed method call return (username.equals(userDetails.getUsername()) &&
 * !isTokenExpired(token)); } }
 */