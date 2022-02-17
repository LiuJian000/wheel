import io.jsonwebtoken.Claims;

/**
 * ClassName: RequestInterceptor
 * Description:
 * date: 2021/12/21 10:50
 *
 * @author liujian
 * @since JDK 1.8
 */
@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    JwtUtil jwtUtil;

    // 在请求进入处理器之前回调这个方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求头
        String header = request.getHeader("Authorization");
// 请求头不为空进行解析
        if (StringUtils.isNotBlank(header)) {
            // 按照我们和前端约定的格式进行处理
            if (header.startsWith("Bearer ")){
                // 得到令牌
                String token = header.substring(7);
                // 验证令牌
                try{ // 令牌的解析这里一定的try起来,因为它解析错误的令牌时,会报错
                    // 当然你也可以在自定义的jwtUtil中把异常 try起来,这里就不用写了
                    Claims claims = jwtUtil.parseJWT(token);
                    String roles =(String) claims.get("roles");
                    System.err.println("roles=="+roles);
                    if (roles!=null&&"admin".equals(roles)){
                        request.setAttribute("role_admin",token);
                    }
                    if (roles!=null&&"user".equals(roles)){
                        request.setAttribute("role_user",token);
                    }
                }catch (Exception e){
                    throw new RuntimeException("令牌不存在");
                }
            }
        }
        return true;
    }
}

