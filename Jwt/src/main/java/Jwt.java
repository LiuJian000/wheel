import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Jwt
 * Description:
 * date: 2021/12/21 10:37
 *
 * @author liujian
 * @since JDK 1.8
 */
public class Jwt {
    public static void main(String[] args) {
        // 生成令牌,主要是用它生成载荷
        JwtBuilder builder = Jwts.builder()
                // 设置头部,使用hs256加密, + key,也就是盐
                .signWith(SignatureAlgorithm.HS256, "changwu")
                // 添加载荷
                .setId("666") // 用户id
                .setSubject("张三") // 用户名
                .setExpiration(new Date(new Date().getTime() + 60 * 10000)) // 过期时间
                .setIssuedAt(new Date())// 登录时间
                // 添加自定义的键值对
                .claim("role", "admin");
        System.out.println(builder.compact());
        Claims map = Jwts.parser().setSigningKey("changwu")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlvKDkuIkiLCJleHAiOjE2NDAwNTUzODYsImlhdCI6MTY0MDA1NDc4Niwicm9sZSI6ImFkbWluIn0.cOjPbG61kvuYyYNY6KBTgqgbHxi6IaGaQAIPT6J2K6w")
                .getBody();

        System.out.println("用户id" + map.getId());
        System.out.println("用户名" + map.getSubject());
        System.out.println("token过期时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(map.getExpiration()));
        System.out.println("用户登录时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(map.getIssuedAt()));
        System.out.println("用户的角色是:"+map.get("role"));

    }

}
