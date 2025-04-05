/*
 * package com.expense.security;
 * 
 * import java.util.Date; import java.util.function.Function;
 * 
 * import javax.crypto.SecretKey;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import com.jwt.security.JwtHelper;
 * 
 * import io.jsonwebtoken.Claims; import io.jsonwebtoken.Jwts; import
 * io.jsonwebtoken.SignatureAlgorithm;
 * 
 * @Component public class JwtUtil {
 * 
 * private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
 * 
 * @Autowired private JwtHelper jwtHelper;
 * 
 * public SecretKey getSecretKey() { return jwtHelper.getSecretKey(); }
 * 
 * public String generateToken(String username) { return Jwts.builder()
 * .setSubject(username) .setIssuedAt(new Date()) .setExpiration(new
 * Date(System.currentTimeMillis() + EXPIRATION_TIME)) .signWith(getSecretKey(),
 * SignatureAlgorithm.HS512) // ✅ Same Key .compact(); }
 * 
 * // Validate Token public boolean validateToken(String token, String username)
 * 
 * { return (username.equals(extractUsername(token)) && !isTokenExpired(token));
 * }
 * 
 * // Username from Token public String extractUsername(String token) { return
 * extractClaim(token, Claims::getSubject); }
 * 
 * // Check is Expired or not public boolean isTokenExpired(String token) {
 * return
 * 
 * extractClaim(token, Claims::getExpiration).before(new Date()); }
 * 
 * // ✅ Extract Claims from Token private <T> T extractClaim(String token,
 * Function<Claims, T> claimsResolver) { final Claims claims =
 * Jwts.parserBuilder().setSigningKey(getSecretKey()) // ✅ Same Key .build()
 * .parseClaimsJws(token).getBody(); return claimsResolver.apply(claims); } }
 */