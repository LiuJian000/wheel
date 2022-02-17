@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Autowired
    RequestInterceptor requestInterceptor;

    // 注册拦截器
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login/**");
    }
}
