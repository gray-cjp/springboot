package com.cjp.springboot.config;
import com.cjp.springboot.commpent.LoginHandlerInterceptor;
import com.cjp.springboot.commpent.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MymvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
        registry.addViewController("/").setViewName("login");
    }
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/index.html").setViewName("login");
            }
        };
        return webMvcConfigurer;
    }
    @Bean
    public LocaleResolver localeResolver(){
        MyLocalResolver myLocalResolver = new MyLocalResolver();
        return myLocalResolver;
    }
    @Bean
    public HandlerInterceptor handlerInterceptor(){
        return new LoginHandlerInterceptor();
    }
}
